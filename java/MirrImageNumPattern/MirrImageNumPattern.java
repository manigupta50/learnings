package learnings.java.MirrImageNumPattern;

import java.util.Scanner;

public class MirrImageNumPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while(i <= n) {
			
			int spaces = 1, c = 1, numbers = 1;
			while(spaces <= n-i) {

				System.out.print(" ");
				spaces++;
			}
			while(numbers <= i) {

				System.out.print(c);
				c++;
				numbers++;
			}

			System.out.println();
			i++;
		}

		
	}

}
