package learnings.java.FindDuplicate;

import java.util.Scanner;

public class FindDuplicate {

    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int length = arr.length;
        boolean status = false;
        int number = 0;

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(i == j)
                    continue;
                if(arr[i] == arr[j]) {
                    status = true;
                    number = arr[i];
                    break;
                }
            }
            if(status == true)
                break;
        }

        return number;
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
            System.out.println(duplicateNumber(arr));
           
            t -= 1;
        }
    }
}


