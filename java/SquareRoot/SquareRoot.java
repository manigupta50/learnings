package learnings.java.SquareRoot;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int temp;
		int sr = n/2;

		if(n == 0)
			System.out.println(0);
		else{
			do{
				temp = sr;
				sr = (temp+(n/temp))/2;
			}while((temp-sr)!=0);
			
			System.out.println(sr);
		}
	}
}

