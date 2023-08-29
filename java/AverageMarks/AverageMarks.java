package learnings.java.AverageMarks;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		//System.out.println("Input");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char name = str.charAt(0);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		int avg = (m1 + m2 +m3)/3;
		System.out.println(name);
		System.out.println(avg);
		
	}

}