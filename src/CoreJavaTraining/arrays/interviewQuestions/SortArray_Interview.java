package CoreJavaTraining.arrays.interviewQuestions;

public class SortArray_Interview {

	public static void main(String[] args) {

		//swap variables with temp
		int a = 1;
		int b = 2;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("a swapped as " +a+ ". b swapped as " +b+ ".");
		
		
		//swap variables without temp
		int aa = 3;
		int bb = 4;
		aa = aa + bb;
		bb = aa - bb;
		aa = aa - bb;
		System.out.println("a swapped as " +aa+ ". b swapped as " +bb+ ".");
		
		
		//sort array
		int arr[] = {5, 4, 3, 2, 1};
		int temp1;
		
		for (int i = 0; i < 5; i++) 
		{
			for (int j = i + 1; j < 5; j++) 
			{
				if (arr[i] > arr[j]) 
				{
					temp1 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp1;
				}
			}
		}
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(arr[i]);
		}

	
	}

}
