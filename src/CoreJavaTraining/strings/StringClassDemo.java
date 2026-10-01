package CoreJavaTraining.strings;

public class StringClassDemo
{

	public static void main(String[] args)
	{	
		/*
		 String: it is one of the pre-built class in java
		 1. String literal
		 2. By creating object of string class		 
		 */
		
		String a = "core java training";		//string literal (creates new memory in string class style)
		String b = " hello";		//(does not create new memory, reference to object of already existing in string poll)
		
		//String a = new String("hello");		//creating object of string class (forcing with new, will still create)
		//String b = new String("hello");
		
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("t"));
		System.out.println(a.length());
		
		System.out.println(a.substring(4, 11));
		System.out.println(a.substring(5));

		System.out.println(a.concat(" is learned"));
		System.out.println(b.trim());
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());

		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);

		System.out.println(b.replace("l", "t"));

	}
}
