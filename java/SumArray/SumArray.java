package learnings.java.SumArray;

import java.util.Scanner;

public class SumArray {

	public static int sum(int[] arr) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr1 = new int[t];
		if(t == 0) {
			return 0;
		} else {
			for(int i = 0; i < t; i++) {
				int sizeOfArray = sc.nextInt();
				int sum = 0;

				for(int j = 0; j < sizeOfArray; j++) {
					sum = sum + sc.nextInt();
				}
				arr1[i] = sum;
			}
			return arr1;

		}
	}
    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int size = sr.nextInt();
            int[] input = new int[size];
            for (int i = 0; i < size; ++i) 
            {
                input[i] = sr.nextInt();
            }
            System.out.println(sum(input));
            t -= 1;
        }
    }
}
