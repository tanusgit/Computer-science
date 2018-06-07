package usedate;

public class Usingdateclass {
	public static void main (String args[]){
		// java.util.Date is a class to provide date and time
		java.util.Date date = new java.util.Date();
		System.out.println("The elapsed time since January 1, 1970 is " +
		date.getTime() + " milliseconds");
		//toString returns a string representing the date and time
		System.out.println(date.toString());
		System.out.println(date);
		
		
	}

}
