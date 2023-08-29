package learnings.java.PowOfNum;

import java.util.Scanner;
public class PowOfNum {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int number = 1;

        if(n==0)
            System.out.println(1);
        else{
            while(n >= 1){
                number *= x;
                n--;
            }
            System.out.print(number);
        } 
        
    }
}
