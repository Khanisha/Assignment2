package Assignment2;

//pre-defined class
import java.util.Scanner;
import java.text.DecimalFormat;

 //user-defined class
 public class Finance extends Trainer implements Bonus { // sub class of Trainer
 Scanner s = new Scanner (System.in);
 private static DecimalFormat df2 = new DecimalFormat("#.##");

//declare variables

 int NoOfParticipant, NoOfTrainers;

//constructor
 public Finance(String CN, String FN, String CM, String CSN) {
	super(CN, FN, CM, CSN); // called method in super class with passing parameter
	
	System.out.println(super.toString());
	
	System.out.println("\nEnter the finance details below : ");
	
	System.out.print("\n1. Total Number of the participants :");
	this.NoOfParticipant = s.nextInt();
	
	System.out.print("\n2. Total Number of Trainers For the event :");
	this.NoOfTrainers = s.nextInt();
	
	System.out.print("\n3. Fee of participant (each) : RM" + super.Fee);
	System.out.println();
	
	System.out.print("\n4. Allowance allocated for trainers (per day) :"+ super.Allowance);
	System.out.println();
	
	System.out.print("\n5. Total No of days of the event :" + super.Days);
	System.out.println();
}
//user-defined class
//create getter method

public int getNoOfParticipant() {
	  return this.NoOfParticipant;
}
public int getNoOfTrainers() {
	  return this.NoOfTrainers;
}

 //Total Expense of the event
 public double totalExpense() {
	double Expense= super.getBonus(getBonus()) * this.NoOfTrainers;
	return Expense;
}

//Total income of the event
public double totalIncome() {
	double Income = super.Fee * this.NoOfParticipant;
	return Income;
}

//Net profit of the event
public double NetProfit() {
	double Profit = totalIncome() - totalExpense();
	return Profit;
}

//print the summary of Finance
public String toString() {
	return "\n------COMPANY FINANCE DETAILS------"
			+ "\nTotal Income : RM" + df2.format(totalIncome())
			+ "\nSalary per Trainer + Bonus: RM" + df2.format(super.getBonus(getBonus()))
			+ "\nTotal Expense : RM" + df2.format(totalExpense())
			+ "\nNet Profit : RM" + df2.format(NetProfit());
}


}
