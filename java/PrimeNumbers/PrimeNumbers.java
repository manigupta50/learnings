package learnings.java.PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 2; i <= n; i++){
			boolean isPrime = true;
			int k = 2;
			while(k <= i/2){
				if(i % k == 0){
					isPrime = false;
					break;
				}
				k++;
			}
			if(isPrime == true)
				System.out.println(i);
		}		
	}
}

