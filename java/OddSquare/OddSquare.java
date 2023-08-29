package learnings.java.OddSquare;

import java.util.Scanner;

public class OddSquare {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1, g = 1;
		while(i <= n*2){

			int j = 1, numbers = i;
			while(j <= n - g + 1){
				System.out.print(numbers);
				numbers += 2;
				j++;
			}

			int l = 1, k = 1;
			while(l < g){
				System.out.print(k);
				k += 2;
				l++;
			}

			System.out.println();
			i += 2;
			g++;
		}
	}
}

