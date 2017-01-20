//import java.io.*;
import java.util.*;
public class Task1
{
	
	public static void main(String[] args)
	{
		int a1, b1, c1;
		 Scanner s1 = new Scanner(System.in);
		 Scanner s2 = new Scanner(System.in);
		 Scanner s3 = new Scanner(System.in);
		 Scanner scan_exit = new Scanner(System.in);


String exit_flag = "y";
while ( exit_flag.equalsIgnoreCase("y") )
{

		System.out.print("Please enter first number: ");
		a1 = s1.nextInt();
		System.out.print("Please enter 2nd number: ");
		b1 = s2.nextInt();
		System.out.print("Please enter 3rd number: ");
		c1 = s3.nextInt();


		if (a1 < b1 &&  b1 < c1)
			System.out.println("The increasing order is: "+a1+" "+b1+" "+c1);
		else
		if (a1 > b1 && b1 > c1)
		System.out.println("The decreasing order is: "+a1+" "+b1+" "+c1);
		else
		if  ( a1 > b1 && b1 == c1)
		System.out.println("The decreasing order is: "+a1+" "+b1+" "+c1);
		else
		if (a1 == b1 && b1 < c1)
		  System.out.println("Increasing order : "+a1+" "+b1+" "+c1);
		else
		if  (a1 < b1 && b1 == c1)
		  System.out.println("Increasing order : "+a1+" "+b1+" "+c1);
		else
		if  (a1 == b1 && b1 == c1)
		  System.out.println("increasing or decreasing order : "+a1+" "+b1+" "+c1);
		else
		System.out.println("No order : "+a1+" "+b1+" "+c1);

for (int i = 0; i < 5; i++)
{
	System.out.println("Loop Numbers are : "+a1+" "+b1+" "+c1);
}

for (int i = 0; i < 5; i++)
{
	System.out.println(+a1);
	System.out.println(+b1);
	System.out.println(+c1);
}



System.out.print(" Do you want to exit Y or N?");


exit_flag = scan_exit.nextLine();
 }

}

}