//10)WAP to call few types of Math Methods
package Assignment1programs;

public class Assignment10 
{
	public static void main(String[] args)
	{
		int negativeNumber = -25;
	      System.out.println("Absolute value of " + negativeNumber + " is: " + Math.abs(negativeNumber));

            double number = 16.0;
        System.out.println("Square root of " + number + " is: " + Math.sqrt(number));
        
        int num1 = 15;
        int num2 = 30;
        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));
        int num3 = 25;
        int num4 = 35;
        System.out.println("Minimum between " + num3 + " and " + num4 + " is: " + Math.min(num3, num4));
        int num5 = 10;
        int num6 = 20;
        System.out.println("Random number between 0 and 1: " + Math.random());
	}
}
