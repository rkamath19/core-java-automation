package CoreJavaTraining.loopsNConditions;

public class ForLoopExample {
	
public static void main(String[] args) {
		
		if (5>2) System.out.println("True");
		else System.out.println("False");
	
		for (int i=0; i<=10; i=i+2) {
			if(i==4) System.out.println("4 is true");
			else System.out.println("4 is false");			
		}
		
		for (int i=0; i<=10; i++) {
			System.out.println(i);
		}
		
	}
}
