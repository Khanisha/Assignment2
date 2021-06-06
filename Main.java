package Assignment2;

public class Main {

	public static void main(String[] args) {
	
     Participant par = new Participant("EDC UUM","DR Khalid Ibrahim","Prof Madya Senan, Prof Abi Binti Sulaiman, DR Khadir","07-8602100");
	 System.out.println(par.toString());
	     
     Finance finan = new Finance("EDC UUM","DR Khalid Ibrahim","Prof Madya Senan, Prof Abi Binti Sulaiman, DR Khadir","07-8602100");
     System.out.println(finan.toString());
     
     
     EducationDayCamp mar = new Marketing("EDC UUM","DR Khalid Ibrahim","Prof Madya Senan, Prof Abi Binti Sulaiman, DR Khadir","07-8602100","https://www.instagram.com/uumofficial/","https://www.facebook.com/search/top?q=school%20of%20computing%2C%20uum");
     System.out.println(mar.toString());
     

}
}
