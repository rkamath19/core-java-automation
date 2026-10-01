package CoreJavaTraining.polymorphism;

public class childLevel
{

	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, String b)
	{
		System.out.println(a);
		System.out.println(b);
	}	
	
	public static void main(String[] args)
	{
		childLevel a = new childLevel();
		a.getData(1);
		a.getData("Second");
		a.getData(3, "Third");
	}

}

//function overloading - same methods with same names but different arguments
//rules: either argument count should be different or either argument return type should be different
