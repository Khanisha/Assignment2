package Assignment2;

	//user-defined class
	public class Marketing extends EducationDayCamp { // sub class of EducationDayCamp
		
	//declare all variables
	 String Insta,FaceB;
	 
	 //constructor with arguments
	 public Marketing(String CN, String FN, String CM, String CSN,String IG, String fb) {
		 super(CN,FN,CM,CSN); // called method in super class with passing parameter
		this.Insta = IG;
		this.FaceB = fb;
	 }
	 
	 //user-defined class
	 //create setter and getter method
		public void setInsta(String IG) {
			  this.Insta = IG;
		  }
		public void setFaceB(String fb) {
			  this.FaceB = fb;
		  }
		public String getInsta() {
			  return this.Insta;
		  }
		public String getFaceB() {
			  return this.FaceB;
		  }
		
		//print the event summary
		  public String toString() {
			return "\nFor more info please visit our Instagram and Facebook like !" +
			"\n"+
			"\nInstagram : "+this.Insta+
			"\nFacebook : "+this.FaceB;
		}
	}


