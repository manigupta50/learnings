package learnings.java.StarPattern;

import java.util.Scanner;

public class StarPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while(i <= n){
			int spaces = 1;
			while(spaces <= n - i){
				System.out.print(" ");
				spaces++;
			}

			int stars = 1;
			while(stars <= i){
				System.out.print("*");
				stars++;
			}

			int stars2 = 1;
			while(stars2 < i){
				System.out.print("*");
				stars2++;
			}
			System.out.println();
			i++;
		}

		
	}

}

