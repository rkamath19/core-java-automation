package CoreJavaTraining.superNThis;

public class childDemo extends parentDemo
{

	public childDemo()
	{
		super();
		System.out.println("Child Constructor");
	}
	
	String name = "Child Name";
	
	public void getStringName()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("Child Method");
	}
	
	public static void main(String[] args)
	{
		childDemo cd = new childDemo();
		cd.getStringName();
		cd.getData();
		
		/*parentDemo pd = new parentDemo();
		System.out.println(pd.name);
		pd.getData();*/
	}
}