package learnings.java.CharPattern;

import java.util.Scanner;

public class CharPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		char c = 'A';
		while(i <= n){
			
			int j = 1;
			c = (char)('A' + i - 1);
			while(j <= i){
				System.out.print(c);
				c = (char)(c + 1);
				j++;
			}
			System.out.println();
			i++;
		}

		
	}

}

