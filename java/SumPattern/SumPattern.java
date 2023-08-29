package learnings.java.SumPattern;

import java.util.Scanner;

public class SumPattern {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1, sum = 0;
		while(i <= n){
			
			int numbers = 1;
			sum = 0;
			while(numbers <= i){
				System.out.print(numbers);
				sum += numbers;
				if(numbers < i)
					System.out.print("+");
				numbers++;
			}

			System.out.println("=" + sum);
			i++;
		}
	}
}

