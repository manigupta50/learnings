package learnings.java.ParallelogramPattern;

import java.util.Scanner;

public class ParallelogramPattern {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while(i <= n){
			
			int spaces = 1;
			while(spaces < i){
				System.out.print(" ");
				spaces++;
			}

			int stars = 1;
			while(stars <= n){
				System.out.print("*");
				stars++;
			}
			System.out.println();
			i++;
		}

	}
}
