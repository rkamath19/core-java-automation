package CoreJavaTraining.interfaceNAbstract.airCraft;

public abstract class ParentAirCraft
{
	
	public void planeEngine()
	{
		System.out.println("This is Main Engine");
	}
	
	public void planeLanding()
	{
		System.out.println("This is Plane Landing");
	}
	
	public abstract void planeColor();
}
