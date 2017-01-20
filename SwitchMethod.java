import java.util.Scanner;

public class SwitchMethod{

	public int a;
	public int b;
	
	SwitchMethod()
	{
	}
	public  void setInt1(int x)
	{
		a = x;
		System.out.println("the number is" +a);
	}
	
	public int getInt1()
	{
		return a;
	}	
	
	public void switchmethod()
	{
		int n;
	do
	{   
		System.out.print("please enter a value : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("the number is" +n);
		switch(n)
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
	} while(n>0 && n<=3);

	}
	public static void main(String[] args)
	{
		SwitchMethod s = new SwitchMethod();

		s.switchmethod();
	}
}

