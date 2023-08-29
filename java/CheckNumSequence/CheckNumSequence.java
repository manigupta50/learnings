package learnings.java.CheckNumSequence;

import java.util.Scanner;

public class CheckNumSequence {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = sc.nextInt();

		boolean isPrev = true, isCurr = true;
		int i = 1, check = 0;

		while(i <= n - 1) {
			int current = sc.nextInt();
			
			if(prev == current) {
				check = 10;
				break;
			}else if(current > prev) {
				if(isPrev == true && isCurr == true) {
					isPrev = false;
					isCurr = true;
				}
				if(isPrev == true && isCurr == false) {
					isPrev = false;
					isCurr = true;
					check++;
				}				
				prev = current;
			}else {
				if(isPrev == false && isCurr == true) {
					isPrev = true;
					isCurr = false;
					check++;
				}
				if(isPrev == true && isCurr == true) {
					isPrev = true;
					isCurr = false;
				}
				prev = current;
				}
			
			i++;
			}
		
		if(check >= 2)
			System.out.print(false);
		else
			System.out.print(true);
		}
		

	}
