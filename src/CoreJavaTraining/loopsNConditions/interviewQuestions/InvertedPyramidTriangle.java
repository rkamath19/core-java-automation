package CoreJavaTraining.loopsNConditions.interviewQuestions;

public class InvertedPyramidTriangle 
{

	public static void main(String[] args) 
	{
		int k = 1;
		
		for(int i = 0; i < 4; i++) 
		{
			for (int j = 1; j <= i + 1; j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
		System.out.println();		
		}
		
		
		
		/*
		 * another way to write inverted pyramid program:
		 * 
		 * for (int i = 1; i < 5; i++)
		 * {
		 * 	for (int j = 1; j <= i; j++)
		 * {
		 * 	System.out.print(k);
				System.out.print("\t");
				k++;
			}
		System.out.println();	
		 * }
		 * }
		 * 
		 */
		
	}

}

/*
1
2 3 
4 5 6
7 8 9 10 
*/