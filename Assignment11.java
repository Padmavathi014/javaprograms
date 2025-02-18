//11) WAP Print from 10 to 40 and -10 to -40 and -10 to 10 using for loop
package Assignment1programs;

public class Assignment11 
{
	public static void main(String[] args) 
	{
        // Print numbers from 10 to 40
        System.out.println("Numbers from 10 to 40:");
        for (int i = 10; i <= 40; i++) 
        {
            System.out.print(i + " ");
        }
        System.out.println(); 

        // Print numbers from -10 to -40
        System.out.println("Numbers from -10 to -40:");
        for (int i = -10; i >= -40; i--) 
        {
            System.out.print(i + " ");
        }
        System.out.println(); 

        // Print numbers from -10 to 10
        System.out.println("Numbers from -10 to 10:");
        for (int i = -10; i <= 10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}

