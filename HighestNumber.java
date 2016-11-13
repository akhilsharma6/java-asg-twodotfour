public class HighestNumber {

	public static void main (String[] args)
	{
		System.out.print("Enter 1st number: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 2nd number: ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.print("Enter 3rd number: ");
		int c = Integer.parseInt(System.console().readLine());
		MaxResult mn = new MaxResult();
		System.out.println(mn.highCalc(a,b,c));
	}			
}

class MaxResult {
	public String highCalc(int x, int y, int z) {
		if ((x >= y) && (x >= z))
		{
			return "The highest number is " + String.valueOf(x);
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
