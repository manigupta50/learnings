package learnings.java.FibonacciNumber;

import java.util.Scanner;

public class FibonacciNumber {

	public static boolean checkMember(int n){

		int a = 0;
		int b = 1;
		int c = 0;
		boolean status = false;

		if(n == 0)
			return true;
		else {
			for(int i = 1; i <= n; i++) {
				if(c <= n ) {
					c = a + b;
					a = b;
					b = c;

					if(c == n) {
						status = true;
						break;
					}
					else
						continue;
				}
			}
		}
		return status;
	}
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
	}
}


