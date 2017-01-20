import java.util.*;

public class get {
	
	
	public static int weight;
	
private static int get() {
		
		return weight;
	}
	private static int set(int weight) 
	{
		
		return weight;
	}
	

	public static void main(String[] args) {

		int a;
        do
        {
            System.out.println("enter a month");	
            Scanner s1 = new Scanner(System.in);
            a = s1.nextInt();
        
           
			switch(a){
            case 1:
             int x = get();
             System.out.println(x);
             break;
         
            case 2:
            	int y = set(weight);
            	
                System.out.println(y);
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
		
	


