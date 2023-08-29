package learnings.java.SwapAlternate;

import java.util.Scanner;

public class SwapAlternate {

    public static void swapAlternate(int arr[]) {
    	//Your code goes here

        int j = 1;
        int temp;

        for(int i=0;i<arr.length-1;i+=2) {
            
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j += 2;
        }

    }
    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            swapAlternate(arr);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
    }
}


