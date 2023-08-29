package learnings.java.IntersectionArrays;

import java.util.Scanner;

public class IntersectionArrays {

    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int[] arr = new int[arr1.length+arr2.length];

        int store = 0;
        

        for(int i = 0; i < arr1.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    arr[store] = arr1[i];
                    arr2[j] = Integer.MIN_VALUE;
                    store++;
                    break;
                }

            }
        }

        for(int l = 0; l < store; l++)
            System.out.print(arr[l] + " ");
    }
    public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr1=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr1[i]=sr.nextInt();
            }
            int m =sr.nextInt();
            int[] arr2=new int[m];
            for (int i =0 ; i<m;i++)
            {
                arr2[i]=sr.nextInt();
            }
            intersections(arr1, arr2);
            System.out .println();
            t -= 1;
        }
    }   
}
