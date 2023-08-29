package learnings.java.NumberStarPattern;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		for(int i = 1; i <= n; i++){
            int t = n;
			for(int j = t; j >= 1; j--){
				if(i == j) {
					System.out.print("*");
					continue;
				}else {
					System.out.print(t);
				}
				t--;
			}
			System.out.println();
			
		}

	}
}

