package learnings.java.CheckAP;

import java.util.Scanner;

public class CheckAP {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean status = true;
		//System.out.println(apNumber);

		if(n == 1)
			return;
		else if(n == 2)
				status = true;
		else{
			int prev = sc.nextInt();
			int current = sc.nextInt();

			int apNumber = current - prev;
			
			while(n >= 3) {
				prev = current;
		//		System.out.println("Prev: " + prev);
				current = sc.nextInt();
		//		System.out.println("Current " + current);
				if((current-prev) == apNumber) {
					status = true;
				}else {
					status = false;
					break;
				}
				n--;
			//	System.out.println("Status " + status);
			//	System.out.println();
			}
		}

		System.out.println(status);

	}
}

