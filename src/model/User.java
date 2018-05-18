package model;

public class User {
	   private int userID;
	   private String userAccount;
	   private String password;
	    
	 
	   public User() {
	        
	   }
	    
	   public int getUserID() {
	       return userID;
	   }
	 
	   public void setUserID(int userID) {
	       this.userID = userID;
	   }
	 
	   public String getuserAccount() {
	       return userAccount;
	   }
	 
	   public void setuserAccount(String userAccount) {
	       this.userAccount = userAccount;
	   }
	   
	   public String getPassword() {
	       return password;
	   }
	 
	   public void setPassword(String password) {
	       this.password = password;
	   }

}
