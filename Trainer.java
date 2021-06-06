package Assignment2;

//pre-defined class
import java.util.Scanner;
import java.text.DecimalFormat;

//user-defined class
public abstract class Trainer extends Event implements Bonus { // this is a superclass defined as a abstract // sub class of Event
	 Scanner s = new Scanner (System.in);
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	//declare the variables
	String FirstName,LastName,Gender,ContactNo, Qualification;
	double Allowance;


	//constructor with arguments
public Trainer(String CN, String FN, String CM, String CSN) {
	super(CN, FN, CM, CSN);
	
	System.out.println(super.toString());
	
	System.out.println("\nEnter the details trainer below : ");
	
	System.out.print("\n1. First Name :");
	this.FirstName = s.nextLine();
	
	System.out.print("\n2. Last Name :");
	this.LastName = s.nextLine();
	
	System.out.print("\n3.Gender :");
	this.Gender = s.nextLine();
	
	System.out.print("\n4. Contact Number :");
	this.ContactNo = s.nextLine();
	
	System.out.print("\n5.Qualification :");
	this.Qualification = s.nextLine();
	
	System.out.print("\n6. Allowance :RM");
	this.Allowance = s.nextDouble();
	
}	

//user-defined class
//create getter method

public String getFirstName() {
	  return this.FirstName;
}
public String getLastName() {
	  return this.LastName;
}
public String getGender() {
	  return this.Gender;
}
public String getContactNo() {
	  return this.ContactNo;
}
public String getQualification() {
	  return this.Qualification;
}
public double getAllowance() {
	  return this.Allowance;
}


//calculate the salary of each trainer
public double calcSalary() {
	double Salary = this.Allowance * super.Days;
	return Salary;
}

// bonus of trainer
public double getBonus() {
	 double bonus = 100;
	 return bonus;
}

//calculate bonus + salary of trainer
public double getBonus(double bonus) {
	double SalaryWithBonus = calcSalary()+ bonus;
	return SalaryWithBonus;
}

//print trainer summary
public String toString() {
	return "\n---TRAINER DETAILS---"+"\nTrainer : "+FirstName+" "+LastName+ "\nGender : "+Gender+"\nContact Number : "+ContactNo+"\nQualification : "+Qualification+"\nTotal Salary: RM"+df2.format(calcSalary())+"\nBonus : RM"+df2.format(getBonus())+"\nSalary + Bonus : RM"+df2.format(getBonus(getBonus()));
}
}
