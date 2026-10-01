package CoreJavaTraining.StaVar;

public class staVar 
{
	String name;			//Instance Variables
	String address;
	
	static String city;			//Class Variables
	static int i;
	static 
	{
		city = "Mumbai";
		i = 0;
	}
	
	staVar(String name, String address)			//Local Variables
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public static void getCity() 
	{
		System.out.println(city);
	}
	
	public void getAddress() 
	{
		System.out.println(address + " " + city);
	}
	
	
	public static void main(String[] args) 
	{
		staVar obj0 = new staVar("Ram", "Bandra");
		staVar obj1 = new staVar("Sham", "Kurla");
		obj0.getAddress();
		obj1.getAddress();
		
		staVar.getCity();
		staVar.i=3;
		
		obj0.address = "Andheri";
		System.out.println(obj0.address);
	}
}
