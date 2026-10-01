package CoreJavaTraining.constructor;

public class constructDemo
{
	
	public constructDemo()
	{
		System.out.println("I am in Constructor");
		System.out.println("Constructor will execute as object is created");
	}
	
	public constructDemo(int a, int b)
	{
		System.out.println("I am in Parametarized Constructor with int args");
		int c = a + b;
		System.out.println(c + " Constructor will execute as object is created with arguments");
	}
	
	public constructDemo(String str)
	{
		System.out.println("I am in Parametarized Constructor with string args");
		System.out.println(str);
	}
	
	public void getData()
	{
		System.out.println("I am in Method");
	}

	
	public static void main(String[] args)
	{
		constructDemo cd = new constructDemo();		//Creating object of class executes Constructor
		
		constructDemo cd2 = new constructDemo(1, 2);
		
		constructDemo cd3 = new constructDemo("Hello");
	}

}
