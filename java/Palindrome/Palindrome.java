package learnings.java.Palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		
		String n = "";
		int n1 = 0, t;
		for(long l = 10; l <= t; l *10) {
			n += sc.next();
			int k = (int)n;
			n1 = n1 + (k * l);
			t = n1/10;
			if(t < 0)
		}

		int k = n, count = 0, mid = 0;
		while(k > 0) {
			int remainder = 0;
			remainder = k%10;
			
			if(remainder > 0)
				count++;
			k /=10;
		}
		
		boolean status = false;
		if(count%2 == 0)
			status = false;
		else{
			mid = (count + 1)/2;
			int i = 0, j = count;
			while(i <= mid && j >= mid) {
				char iThPlace = n.charAt(i);
				char jThPlace = n.charAt(j);
				if(iThPlace == jThPlace)
					status = true;
				else {
					status = false;
					break;
				}
				i++;
				j--;

			}
		}
		System.out.println(status);

	}
}
