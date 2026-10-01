package CoreJavaTraining.collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample 
{

	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Fourth");
		hs.add("Fifth");
		
		System.out.println(hs);
		
		//System.out.println(hs.remove("First"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
}
