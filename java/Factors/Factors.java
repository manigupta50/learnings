package learnings.java.Factors;

import java.util.Scanner;

public class Factors {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int i = 2;
        boolean isPrime = true;
        if(n == 2)
            System.out.print("-1");
        while(i <= n/2) {
            if(n % i == 0) {
                isPrime = false;
            }
            i++;
        }

        if(isPrime)
            System.out.print("-1");

        i = 2;
        while(i<=n/2){
            if(n%i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}