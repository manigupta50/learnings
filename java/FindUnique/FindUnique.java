package learnings.java.FindUnique;

import java.util.Scanner;

public class FindUnique {

    public static int findUnique(int[] arr){
		//Your code goes here
      boolean status = false;
      int number = 0;

      if(arr.length == 1)
        return arr[0];
      


      for(int i = 0; i <= arr.length - 1; i++) {
        
        for(int j = 0; j <= arr.length - 1; j++) {

          if( i == j)
            continue;
          
          if(arr[i] == arr[j]) {
            status = false;
            number = 0;
            break;
          }else {
            number = arr[i];
            status = true;
          }
         
        }

        if(i == (arr.length - 1) && status == false)
          number = arr[i];
       
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
            System.out.println(findUnique(arr));
           
            t -= 1;
        }
    }    
}


