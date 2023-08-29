package learnings.java.TrianglesOfNumbers;

import java.util.Scanner;

public class TrianglesOfNumbers {

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

			int numbers = 1, k = i, t = 0;
			while(numbers <= k){
				t = k + numbers - 1;
				System.out.print(t);
				numbers++;
			}

			int rNumbers = 1;
			while(rNumbers < i){
				System.out.print(--t);
				rNumbers++;
			}
			System.out.println();
			i++;
		}
	}
}
