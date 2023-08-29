package learnings.java.InterestingAlpha;

import java.util.Scanner;

public class InterestingAlpha {
	public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		char k = (char)('A' + n - 1);
		while(i <= n){
			int j = 1;
			char c = (char)(k - i + 1);
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