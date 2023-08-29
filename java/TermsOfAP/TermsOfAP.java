package learnings.java.TermsOfAP;

import java.util.Scanner;

public class TermsOfAP {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int count = 0;

		for(int i = 1; ; i++){
			int j = (3 * i) + 2;
			if(count == x)
				break;
			else if(j % 4 == 0)
				continue;
			else{
				count++;
				System.out.print(j + " ");
			}
		} 

	}
}

