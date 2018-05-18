package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Authenticator {
	private static String classForName;
	private static String url;
	private static String username;
	private static String userpass;
	private static Stack<Connection> connPools;

		static{
			connPools = new Stack<Connection>();
			classForName = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/mrdatabase";
			username= "root";
			userpass ="";
			try {
				Class.forName(classForName).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		public static Connection connect() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
			Connection conn = null;
			
			if (connPools.empty()){
				conn = DriverManager.getConnection(url, username, userpass);
			}else
				conn = connPools.pop();
			
			return conn;	
		}
		
		public static void disconnect (Connection conn){
			if(conn !=null){
				connPools.push(conn);
			}
		}
		
	public static boolean Authenticate (String useraccount, String pass, String role  ){
		Connection cnn = null;
		Statement stm=null;
		ResultSet rs = null;
		Boolean tmp= false;
		
		try {
			try {
				cnn = Authenticator.connect();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stm = cnn.createStatement();
			rs =  stm.executeQuery("SELECT * FROM user, userrole, role WHERE user.userID= userrole.userID and role.roleID= userrole.roleID and userAccount='"+ useraccount +"' AND Password ='"+ pass + "'AND roleName ='"+ role +"'");
			tmp=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return tmp;
	}
	
	public static boolean ReadPermissionPatient (String useraccount, String mrID ){
		Connection cnn = null;
		Statement stm=null;
		ResultSet rs = null;
		Boolean tmp= false;
		
		try {
			try {
				cnn = Authenticator.connect();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stm = cnn.createStatement();
			rs =  stm.executeQuery("SELECT medicalrecord.mrID FROM user, patient, medicalrecord WHERE user.userID= patient.uID and patient.pID= medicalrecord.pID and userAccount='"+ useraccount +"'AND mrID ='"+ mrID +"'");
			tmp=rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return tmp;
	}
}
