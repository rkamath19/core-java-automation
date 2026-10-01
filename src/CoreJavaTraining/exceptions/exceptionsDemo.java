package CoreJavaTraining.exceptions;

import java.lang.reflect.Array;

public class exceptionsDemo 
{

	public static void main(String[] args)
	{
		int a = 0;
		int b = 1;
		int d[] = new int[5];
		
		try 
		{
			int c = b / a;
			System.out.println(d[5]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception caught!!");
		}
		catch(IndexOutOfBoundsException iofbe) 
		{
			System.out.println("Index Out Of Bounds Exception caught!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught!!");
		}
		finally 
		{
			System.out.println("Delete Cookies and Close Browser!!");
		}
	}
}
