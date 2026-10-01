package CoreJavaTraining.collections;

import java.util.ArrayList;

public class arrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("First");
		ar.add("Second");
		ar.add("Third");
		ar.add(0, "Zero");
		
		System.out.println(ar);
		
		ar.remove(0);
		System.out.println(ar);
		ar.remove("Second");
		System.out.println(ar);
		
		System.out.println(ar.contains("Third"));
		
		System.out.println(ar.indexOf("Third"));
		System.out.println(ar.isEmpty());
		System.out.println(ar.size());
	}
}
