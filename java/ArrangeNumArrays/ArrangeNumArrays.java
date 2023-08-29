package learnings.java.ArrangeNumArrays;

import java.util.Scanner;

public class ArrangeNumArrays {

    public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int num = 1;
        if(n%2 == 0) {
            int j = n - 1;
            for(int i=0;i<n/2;i++) {
                arr[i] = num;
                arr[j] = num + 1;
                num += 2;
                j--;
            }
        }else {
            int j = n - 1;
            for(int i=0;i<=n/2;i++) {
                arr[i] = num;
                if(j > n/2)
                    arr[j] = num + 1;
                num += 2;
                j--;
            }
        }
        
    }
    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            arrange(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
    }    
}

