package Assignment2;

//pre-defined class
import java.util.Scanner;


//user -defined class
public class Participant extends EducationDayCamp { //sub class of EducationDayCamp
    
	Scanner s = new Scanner(System.in);

	
	//declare the variables
	String FirstName,LastName,Gender,ContactNo;
	int Age;
	
	// constructor sub class with argument
	public Participant(String CN, String FN, String CM, String CSN) { 
		super(CN,FN,CM,CSN); // called method in super class with passing parameter
		
		System.out.println(super.toString());
		
		System.out.println("\nEnter the details participant below : ");
		
		System.out.print("\n1.First Name : ");
		this.FirstName = s.nextLine();
		
		System.out.print("\n2.Last Name : ");
		this.LastName = s.nextLine();
		
		System.out.print("\n3.Gender : ");
		this.Gender = s.nextLine();
		
		System.out.print("\n4.Contact Number : ");
		this.ContactNo = s.nextLine();
		
		System.out.print("\n5.Age : ");
		this.Age = s.nextInt(); 	
	}
	
	//user-defined class
	//create getter method
	
	public String getFirstName() {
		return this.FirstName;
	}
	public String getLastName() {
		return this.LastName;
	}
	public int getAge() {
		return this.Age;
	}
	public String getGender() {
		return this.Gender;
	}
	public String getContactNo() {
		return this.ContactNo;
	}
	
	//print participant summary
	public String toString() {
		return "\n---PARTICIPANT DETAILS---"+"\nParticipant : "+FirstName+" "+LastName+"\nAge : "+Age+"\nGender : "+Gender+"\nContact Number : "+ContactNo;
	}
}
