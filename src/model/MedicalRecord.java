package model;

public class MedicalRecord {
	private String mrID;
	   private int pID;
	   private int dID;
	   private String content;
	 
	   public MedicalRecord() {
	 
	   }
	 
	   public MedicalRecord(String mrID, int pID, int dID, String content) {
	       this.mrID = mrID;
	       this.pID = pID;
	       this.dID = dID;
	       this.content = content;
	   }
	 
	   public String getmrID() {
	       return mrID;
	   }
	 
	   public void setmrID(String mrID) {
	       this.mrID = mrID;
	   }
	 
	   public int getpID() {
	       return pID;
	   }
	 
	  public void setpID(int pID) {
	       this.pID = pID;
	   }
	  
	  public int getdID() {
	       return dID;
	   }
	   
	   public void setdID(int dID) {
	       this.dID = dID;
	   }
	 
	   public String getcontent() {
	       return content;
	   }
	   
	   public void setcontent(String content) {
	       this.content = content;
	   }

}
