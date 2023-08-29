package learnings.java.FarhenhitToCelciusTable;

import java.util.Scanner;

public class FarhenhitToCelciusTable{

    public static int fahrenhit(int start) {
		int celcius = (5 * (start - 32))/9;
		return celcius;
	}

	public static void printFahrenheitTable(int start, int end, int step) {

		Scanner sc = new Scanner(System.in);
		int celcius = 0;

		for(int i = start; i <= end;) {
			System.out.println(i + "\t" + fahrenhit(i)); ;
			i = i + step;
		}	 
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
	}
}