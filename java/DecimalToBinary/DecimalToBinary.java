package learnings.java.DecimalToBinary;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		// Write your code here

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		int count0 = 0, count1=0;
		String s = "";
		long a;

		if(n == 0)
			System.out.println(0);

		while(n>0){
			a = n%2;
			s = a+""+s;
			n = n/2;
		}
		System.out.print(s);
	}
}
