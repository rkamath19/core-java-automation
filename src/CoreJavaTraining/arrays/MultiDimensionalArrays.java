package CoreJavaTraining.arrays;

public class MultiDimensionalArrays 
{
	public static void main(String[] args) 
	{
		int a [][] = new int [2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;		
		System.out.println(a[1][2]);
		
		for (int i = 0; i < 2; i++) //rows
		{
			for (int j = 0; j < 3; j++) //columns
			{
				System.out.println(a[i][j]);
			}
		}
		
		
		int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(b[2][1]);
	
	}
}

/*
1 2 3
4 5 6
7 8 9
*/