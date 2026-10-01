package CoreJavaTraining.loopsNConditions;

public class WhileLoopExample {

	public static void main(String[] args) {

		/* infinite loop
		int i=0;
		while(i<10) {
			System.out.println(i);
		}*/
		
		int i = 10;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		
		int j = 10;
		do {
			System.out.println(j);
			j++;
		}
		while(j<21);
		
	}

}
