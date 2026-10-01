package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTutorail 
{
	
	public void method1()
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Arvind");
		names.add("Ram");
		names.add("Albert");
		names.add("Zack");
		names.add("Alan");		
		
		int count = 0;
		
		for(int i = 0; i < names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{	
				count++;
			}
		}	
		System.out.println(count);
	}
	
	public void method2() 
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Arvind");
		names.add("Ram");
		names.add("Albert");
		names.add("Zack");
		names.add("Alan");
		
		long a = names.stream().filter(s->s.startsWith("A")).count();
		
		System.out.println(a);
		
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));	
	}
	
	public void method3()
	{
		long b = Stream.of("Arvind","Ram","Albert","Zack","Alan").filter(s -> 
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(b);
	}
	
	public void streamsMap()
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jayesh");
		names.add("Lata");
		names.add("Vishal");
		names.add("Sohail");
		names.add("Monish");
		
		Stream.of("Arvinda","Rama","Alberta","Zack","Alan").filter(s -> s.endsWith("a"))
		.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		List<String> names1 = Arrays.asList("Arvind","Ram","Albert","Zack","Alan");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));
		
		Stream<String> newStream1 = Stream.concat(names.stream(), names1.stream());
		boolean flag = newStream1.anyMatch(s -> s.equalsIgnoreCase("Vishal"));
		System.out.println(flag);
	}
	
	public void streamsCollect()
	{
		List<String> ls = Stream.of("Arvind","Rama","Alberta","Zack","Alan").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> value = Arrays.asList(5, 10, 9, 5, 8, 44, 2, 4, 7, 8, 10, 44, 1);
		
		value.stream().distinct().forEach(s -> System.out.println(s));
		
		value.stream().distinct().sorted().forEach(s -> System.out.println(s));
		
		List<Integer> l = value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(l.get(2));
	}
	
	public static void main(String[] args) 
	{
		StreamsTutorail st = new StreamsTutorail();
		st.method1();
		st.method2();
		//st.method3();
		st.streamsMap();
		st.streamsCollect();
	}
}
