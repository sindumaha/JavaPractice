
public class StringBuff {

	public static void main(java.lang.String[] args) {
		
		long startTime = System.currentTimeMillis();

		String a = "Hello";
		String b = "World";
		StringBuffer sBuffer = new StringBuffer(15); 
		
		
	for (int i=0; i<10000; i++)
	{
		sBuffer.append(a).append(" ").append(b); 
		
	}
	System.out.println(sBuffer.toString());

		long endTime = System.currentTimeMillis();
		long runTime = endTime-startTime;
		
		
		System.out.println("Runtime: " + runTime/((double)1000) + " seconds");
	}
	
	

}
