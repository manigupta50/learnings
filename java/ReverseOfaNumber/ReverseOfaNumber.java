package learnings.java.ReverseOfaNumber;

import java.util.Scanner;

public class ReverseOfaNumber {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int mod = 0, count = 0, multiplier = 0, value = 0, multiplier2 = 1;
		for(int i = n; i > 0;){
			multiplier = i / 10;
			if(multiplier > 0)
				count++;
			 i = i / 10;
		}

		for(int j = 1; j <= count; j++)
				multiplier2 *= 10;
		
		for(int i = n; i > 0;){
			mod = i % 10;
			value += (mod * multiplier2);
			multiplier2 /= 10;
			i = i / 10;
		}
		System.out.print(value);
		
		
	}
}
