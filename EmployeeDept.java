import java.util.Scanner;
class Employee {
	 String str = " ";
	 int deptnum; 
	
	public  void setDeptnum(int n)
	{
	 deptnum = n;
	}
	public  int getDeptNum()
	{
		return deptnum;
	}

	
	public  void setDeptName(int n)
	{		
	int x = n;
		switch(x)
		{
	    case 1:
	     str="Computers";
	     //System.out.println(str);
	     break;
	 
	    case 2:
	         str="Electronics";
	       // System.out.println(str);
	        break;
	        
	    case 3:
	         str="Civil";
	        //System.out.println(str);
	        break;
	        
	    default:
	    	  System.out.println("Invalid choice!");
	             break;
	  			}

}
	
	public  void empdetails()
	{
		System.out.println(deptnum + ".." + str);
	
	}
}


public class EmployeeDept {
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		System.out.println("Please select the dept from the following:  1:computers 2:Electronics 3:Civil");
	
		 Scanner scan1 = new Scanner(System.in);
	
		System.out.print("please enter a dept value : ");
		int n = scan1.nextInt();
		e.setDeptnum(n);
		e.setDeptName(e.getDeptNum());
		e.empdetails();
		
	
	}
	
}