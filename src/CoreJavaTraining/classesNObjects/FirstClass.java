package CoreJavaTraining.classesNObjects;

public class FirstClass {

	static int a = 1;
	
	public void getData() {
		System.out.println("First Method");
	}
	
	public static void main(String[] args) {
		
		FirstClass fo = new FirstClass();
		fo.getData();
		
		SecondClass so = new SecondClass();
		so.setData();
		
		System.out.println(a);
		
		System.out.print("Wow ");
		System.out.println("Hello");
		System.out.println("World");

	}

}
