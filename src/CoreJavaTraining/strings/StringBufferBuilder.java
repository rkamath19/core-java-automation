package CoreJavaTraining.strings;

public class StringBufferBuilder {

	public static void main(String[] args) {
		
		String a = "hello"; //String literal --Immutable
		String b = "hello";
		
		String c = a.concat(" world");
		System.out.println(c);
		
		String d = new String("hello"); //String classs creates new objects every time in memory
		String e = new String("hello");
		
		System.out.println(a.equals(b));
		System.out.println(a==b);
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equals(d)); //equals operator checks for the content //true
		System.out.println(a==d);	//== operator checks object reference pointing to same location or not //if matching the references //fail
		System.out.println(d==e); 	//references are different as they are defined with string class //fail
		
		
		//StringBuffer and StringBuilder  --Mutable
		StringBuffer f = new StringBuffer("hello");
		//System.out.println(f.length());
		f.insert(4, " to ");
		System.out.println(f);
		f.replace(2, 4, "aa");
		System.out.println(f);
		f.deleteCharAt(7);
		System.out.println(f);
		f.reverse();
		System.out.println(f);
		
		//StringBuilder is not tread safe. It is non synchronized. It is faster
		
		

	}

}
