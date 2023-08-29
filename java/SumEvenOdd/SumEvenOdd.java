package learnings.java.SumEvenOdd;

import java.util.Scanner;
public class SumEvenOdd {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0, odd = 0;

		while(n > 0){
			int number = n%10;

			if(number%2 == 0)
				even += number;
			else
				odd += number;
			n = n/10;
		}
		System.out.print(even + " " + odd);
	}
}

