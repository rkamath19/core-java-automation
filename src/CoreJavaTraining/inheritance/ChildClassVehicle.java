package CoreJavaTraining.inheritance;

public class ChildClassVehicle extends ParentClassVehicle
{

	public void vehicleEngine()
	{
		System.out.println("This is Vehicle Engine");
	}
	
	public void vehicleColor()
	{
		System.out.println(color);
	}
	
	public void vehicleSeat()
	{
		System.out.println("This is Child Vehicle Seat");
	}
	
	public static void main(String[] args)
	{
		ChildClassVehicle a = new ChildClassVehicle();
		a.vehicleEngine();
		a.vehicleColor();
		
		a.vehicleGear();
		a.vehicleBreaks();
		
		a.vehicleSeat();	//function overriding	//both have same method name, signature, return type, argument list/data type
		
		//ParentClassVehicle b = new ParentClassVehicle();	//allowed due to inheritance we are extending not implementing
	}
}
