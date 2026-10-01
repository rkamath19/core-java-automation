package CoreJavaTraining.collections.hashMapNHashTable;

import java.util.ArrayList;

public class printUniqueNumberAIQ {

	public static void main(String[] args) {

		int a[] = {1, 1, 2, 1, 3, 2, 3, 4, 9, 5, 4};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < a.length; i++)
		{	
			int k = 0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j = i + 1; j < a.length; j++)
				{
					if(a[i] == a[j]) 
					{
						k++;
					}
				}	
			}
			if(k == 1) 
			{
				System.out.println(a[i] + " is the unique number!");
			}
		}

	}

}
