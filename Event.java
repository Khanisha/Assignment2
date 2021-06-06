package Assignment2;

//pre-defined class
//import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Scanner;

//user-defined class
public abstract class Event extends EducationDayCamp{ // this is a superclass defined as a abstract // sub class of EducationDayCamp
	
	Scanner s = new Scanner(System.in);
	private static DecimalFormat df2 = new DecimalFormat("##.##");
	
	//declare all variables
	 protected String EventName, Location, MainActivity;
	 protected int Days;
	 protected double Fee;
	  
	 
		//constructor sub class with arguments
		  public Event(String CN, String FN, String CM, String CSN) {
			  super(CN, FN, CM, CSN); // called method in super class with passing parameter
			  
			 System.out.println("\nEnter the event details below : ");
			  
			 System.out.print("\n1. Enter the Event title :");
				this.EventName = s.nextLine();
				
			 System.out.print("\n2. Enter the location :");
				this.Location = s.nextLine();
				
			System.out.print("\n3. Enter the main activity of the event :");
				this.MainActivity = s.nextLine();
				
			System.out.print("\n4. Enter the duration of the event (days) :");
				this.Days = s.nextInt();
				
			System.out.print("\n5. Enter the fee of the event :RM");
				this.Fee = s.nextDouble();

		  }
		   
	 
	  //create getter method
		  
	  public String getEventName () {
		  return this.EventName;
	  }
	  public String getLocation () {
		  return this.Location;
	  }
	  public String getMainActivity () {
		  return this.MainActivity;
	  }
	  public int getDays () {
		  return this.Days;
	  }
	  public double getFee () {
		  return this.Fee;
	  }
	
	  //print the event summary
	  public String toString() {
		  return  
	  "\n---EVENT DETAILS---"+
	  "\nEvent Name : "+this.EventName+
	  "\nLocation : "+this.Location+
	  "\nMain Activity : "+this.MainActivity+
	  "\nDuration (days) : "+this.Days+
	  "\nFee : RM"+df2.format(this.Fee);
	  }
	
}
