package learnings.java.Sort01;

import java.util.Scanner;

public class Sort01 {

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int j = arr.length - 1;

        for(int i = 0; i < j; i++) {
            int temp = 0;

            if(arr[i] == 0)
                continue;

            else {
                for(; j > i; j--) {

                    if(arr[j] == 1)
                        continue;
                    
                    else {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                        
                }
            }
        }
    }
    public static void main(String[] args) 
    {
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
            sortZeroesAndOne(arr);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
    }    
}
