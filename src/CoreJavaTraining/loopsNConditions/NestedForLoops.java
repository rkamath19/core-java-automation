package CoreJavaTraining.loopsNConditions;

public class NestedForLoops {

	public static void main(String[] args) {

		//Nested For Loops
		
		for(int i = 1; i <= 4; i++) 	// Outer For Loop; this block will loop for 4 times
		{
			
			System.out.println("Outer Loop Started");
			
			for(int j = 1; j <= 4; j++) 	//Inner For Loop; this block will loop for 4 times, for every 1 outer loop run the inner loop will be fully executed
			{
				System.out.println("Inner Loop");
			}
			
			System.out.println("Outer Loop Ended");
			
		}
		

	}

}
