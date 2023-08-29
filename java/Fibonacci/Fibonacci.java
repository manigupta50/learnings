package learnings.java.Fibonacci;

import java.util.Scanner;

public class Fibonacci {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0, b = 1, c = 0;

		if(n == 0)
			b = a;
		else{
			for(int i = 2; i<=n ; i++){
				c = a + b;
				a = b;
				b = c;
			}
				
		}
		System.out.println(b);
		
	}

}

