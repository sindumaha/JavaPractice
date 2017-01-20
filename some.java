import java.util.Scanner;

public class some{

	public int a;
	public int b;
	
	some()
	{
	}
	public  void setInt1(int x)
	{
		a = x;
		System.out.println("the number is  " +a);
	}
	
	public int getInt1()
	{
		return a;
	}

	
	public static void main(String[] args)
	{
		some s = new some();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the following numbers 1:january  2:february 3:march");
do
{   
	
	System.out.print("please enter a value : ");
	int n = scan.nextInt();
	s.setInt1(n);
	int i =  s.getInt1();
	System.out.println("the number is " +s.getInt1() +" " +i);
	
	switch(s.getInt1())
	{
    case 1:
     String str="january";
     System.out.println(str);
     break;
 
    case 2:
        String str1="february";
        System.out.println(str1);
        return;
        
    case 3:
        String str2="march";
        System.out.println(str2);
        return;
        
    default:
    	  System.out.println("Invalid choice!");
             break;
  			}
	
	//System.out.println("do you want to stop?");

} while(s.getInt1()>0 && s.getInt1()<=3);

	}
}

