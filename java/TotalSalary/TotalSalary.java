package learnings.java.TotalSalary;

import java.util.Scanner;
import java.lang.Math;

public class TotalSalary {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);

		int basic = sc.nextInt();
		String ch = sc.next();
		char grade = ch.charAt(0);
		
		
		System.out.println(calculator(basic, grade));
	}
		static int calculator(int basic, char grade){

			double allow = 0.0;
			int totalSalary1 = 0;
			double basic1 = basic;
			double totalSalary = 0.0;
			if(grade >= 'a' && grade <= 'z'){
				System.out.println("Mention Grade in Upper Case, re-enter details");
			}else{
				if(grade == 'A'){
					allow = 1700.0;
				}
				else if(grade == 'B'){
					allow = 1500.0;
				}
				else if(grade >= 'C' && grade <= 'Z'){
					allow = 1300.0;
				}else {
					System.out.println("Not a valid Grade");	
				}
				totalSalary = basic1+((20*basic1)/100)+((50*basic1)/100)+allow-((11*basic1)/100);
				totalSalary1 = (int)Math.round(totalSalary);
			}
			return totalSalary1;
		}
	
}

