/* Program to display highest of 3 numbers */

public class HighestNumber {

	public static void main (String[] args)
	{
		//Receive three inputs from console.
		System.out.print("Enter 1st number: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd number: ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 3rd number: ");
		int c = Integer.parseInt(System.console().readLine());
		//Declare object
		MaxResult mn = new MaxResult();
		//Display the highest number after calling the highCalc method.
		System.out.println(mn.highCalc(a,b,c));	// Pass input by reference.
	}			
}
// Class to define MaxResult logic
class MaxResult {
	public String highCalc(int x, int y, int z) { //Method receives three inputs
		if ((x >= y) && (x >= z))	// if logic, checks if x is greater among the other two.
		{
			return "The highest number is " + String.valueOf(x);	// Because return type is String, so using String.valueOf method to convert Int to String.
		}
		if ((y >= x) && (y >= z))
		{
			return "The highest number is " + String.valueOf(y);
		}
		if ((z >= x) && (z >= y))
		{
			return "The highest number is " + String.valueOf(z);
		}
		return "Invalid Inputs!";
	}
}