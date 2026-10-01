package CoreJavaTraining.arrays.interviewQuestions;

public class MDA_MinNo_Interview
{

	public static void main(String[] args)
	{

		int abc[][] = {{2, 5, 13}, {6, 0, 9}, {1, 7, 10}};
		int min = abc[0][0];
		int max = abc[0][0];
		int minColumn = 0;
				
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++)
			{
				if (abc[i][j] < min)
				{
					min = abc[i][j];
					minColumn = j;
				}
				if (abc[i][j] > max) 
				{
					max = abc[i][j];
				}
			}
		}
		System.out.println("Minimum Number from matrix is " + min);
		System.out.println("Maximum Number from matrix is " + max);
		
		
		int k = 0;
		int maxMinColumn = abc[0][minColumn];
		
		while(k < 3) 
		{
			if(abc[k][minColumn] > maxMinColumn) 
			{
				maxMinColumn = abc[k][minColumn];
			}
			k++;
		}
		System.out.println("The Maximum Number from the Minimun Number Column is " +maxMinColumn);		
	}
}