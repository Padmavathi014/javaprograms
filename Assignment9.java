//9) WAP to call Scanner methods
package Assignment1programs;
import java.util.Scanner;

public class Assignment9 
{
		    public static void main(String[] args) 
	    {
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter your name: ");
	         String name = sc.nextLine();
	         System.out.println("Your name is: " + name);
	         System.out.print("Enter your age: ");
	         int age = sc.nextInt();
	         System.out.println("You are " + age + " years old.");
	         System.out.print("Enter your height in meters: ");
	         double height = sc.nextDouble();
	         System.out.println("Your height is " + height + " meters.");
	         System.out.print("Are you a student? (true/false): ");
	         boolean isStudent = sc.nextBoolean();
	         System.out.println("Student status: " + isStudent);
	         sc.close();
	    }
	}


