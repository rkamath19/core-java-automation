package CoreJavaTraining.interfaceNAbstract.airCraft;

public class ChildAirCraft extends ParentAirCraft
{

	public static void main(String[] args)
	{
		ChildAirCraft a = new ChildAirCraft();
		a.planeEngine();
		a.planeLanding();
		a.planeColor();
		
		//ParentAirCraft b = new ParentAirCraft();	we cannot create object of abstract classes
	}

	@Override
	public void planeColor()
	{
		System.out.println("This is Plane Color");
	}

}
