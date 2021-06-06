package Assignment2;


//user-defined class
public abstract class EducationDayCamp { // this is a superclass defined as a abstract

	
	
//declare all variables
 protected String CompanyName, FounderName, CommitteeMembers, CustomerServiceNo;



//constructor with arguments
public EducationDayCamp(String CN, String FN, String CM, String CSN) {
	this.CompanyName = CN;
	this.FounderName = FN;
	this.CommitteeMembers = CM;
	this.CustomerServiceNo = CSN;

	
}

//create getter method
public String getCompanyName() {
	  return this.CompanyName;
}
public String getFounderName() {
	  return this.FounderName;
}
public String getCommitteeMembers() {
	  return this.CommitteeMembers ;
}
public String getCustomerServiceNo() {
	  return this.CustomerServiceNo;
}
 //print the Company summary
public String toString() {
	return "---COMPANY DETAILS---" +
			  "\nCompany Name: " + this.CompanyName +
			  "\nFounder Name: " +this.FounderName +
			  "\nCommittee Members: "+this.CommitteeMembers +
			  "\nCustomer Service Number: "+this.CustomerServiceNo;
}

}
