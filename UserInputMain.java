package RavishankarGJava;

import java.util.Scanner;

public class UserInputMain
{
	public static void main(String args[])
	{
		int age;
		float fees;
		String name;
		char gender;
		
		Scanner sc = new Scanner(System.in);
		
		//User Input
		System.out.println("Enter Name: ");
		name = sc.next();
		System.out.println("Enter Age: ");
		age = sc.nextInt();
		System.out.println("Enter Fees: ");
		fees = sc.nextFloat();
		System.out.println("Enter Gender M/F: ");
		gender = sc.next().charAt(0);
		
		//Display
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Fees = "+fees);
		System.out.println("Gender = "+gender);
	}

}
