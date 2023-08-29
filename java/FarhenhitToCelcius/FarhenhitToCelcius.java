package learnings.java.FarhenhitToCelcius;

import java.util.Scanner;

public class FarhenhitToCelcius {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();

		for(int i=s; i<=e; i+=w){
			int celcius = 5*(i-32)/9;
			System.out.println(i + " " + celcius);
		}
		
	}

}
