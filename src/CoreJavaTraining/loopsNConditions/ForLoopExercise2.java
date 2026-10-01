package CoreJavaTraining.loopsNConditions;

public class ForLoopExercise2 {

	public static void main(String[] args) {

		int k = 3;
		
		for (int i = 1; i < 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				k = k * j;
				System.out.print(k);
				System.out.print("\t");
			}
		System.out.println();
		}
		
	}

}

/*
3
6 9
12 15 18
*/
