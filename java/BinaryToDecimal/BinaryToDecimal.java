package learnings.java.BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int multiplier = 0, count = 0, lastNumber = 0, power, sum = 0;

		for(int i = n; i > 0;){
			multiplier = i / 10;
			if(multiplier >= 0)
				count++;
			 i = i / 10;
		}
		//System.out.println(count);

		for(int i = 1; i <= count; i++){
			lastNumber = n % 10;
			power = 1;
			for(int j = 0; j < i; j++){
				if(j == 0){
					power *= 1;
				}else{
					power *= 2;
				}
			}
			sum += lastNumber * power;
			n /= 10;
		}
		System.out.println(sum);

	}
}
