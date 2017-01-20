


public class StringTask {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		String a = "Hello";
		String b = "World";
		String c="";
		
		for (int i=0; i<10000; i++)
		{
			a  = a + b;
		
		}
		System.out.println(a);

		long endTime = System.currentTimeMillis();
		long runTime = endTime-startTime;
		
		
		System.out.println("Runtime: " + runTime/((double)1000) + " seconds");
	}
	
	

}
