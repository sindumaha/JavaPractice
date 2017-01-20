import java.util.*;

public class exam {	
	   int month = (Integer) null;
	
	public static void main(String[] args) {
	
		int a;
        do
        {
            System.out.println("enter a month");	
            Scanner s1 = new Scanner(System.in);
            a = s1.nextInt();
        
           
			switch(a){
            case 1:
             String str="january";
             System.out.println(str);
             break;
         
            case 2:
                String str1="february";
                System.out.println(str1);
                break;
                
            case 3:
                String str2="march";
                System.out.println(str2);
                break;
                
            default:
            	  System.out.println("Invalid choice!");
                     break;
          			}
    
        }while(a >= 1 && a <=4);
		return;
  }

}
