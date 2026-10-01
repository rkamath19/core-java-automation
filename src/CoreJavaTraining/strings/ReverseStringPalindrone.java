package CoreJavaTraining.strings;

public class ReverseStringPalindrone {

	public static void main(String[] args) {

		String s = "madam";
		String t = "";
		
		//System.out.println(s.length());

		for(int i = s.length() - 1; i >= 0; i--) 
		{
			t = t + s.charAt(i);				//System.out.println(s.charAt(i));
		}
		
		System.out.println(t);
		
		if(s.equals(t))
		{
			System.out.println("Is a palindrone");
		}
		else 
		{
			System.out.println("Not a palindrone");
		}
		
	}

}
