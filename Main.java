public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		String res = "";
		
		int n = 100000;
		for(int i=0; i<n; ++i){
			res += "2";
		}
		
		long endTime = System.currentTimeMillis();
		long runTime = endTime-startTime;
		System.out.println("Runtime: " + runTime/((double)1000) + " seconds");
	}
	
}   