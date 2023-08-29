package learnings.java.HalfDiamondPattern;

import java.util.Scanner;

public class HalfDiamondPattern {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        System.out.println("*");
        while(i <= n){
            System.out.print("*");
            
            int numbers = 1;
            while(numbers <= i){
                System.out.print(numbers);
                numbers++;
            }

            int numbers2 = 1, k = i;
            while(numbers2 < k){
                System.out.print(--k);
            }

            System.out.println("*");
            i++;
        }

        int j = 1;
        while(j <= n - 1){
            System.out.print("*");

            int numbers = 1;
            while(numbers < n - j + 1){
                System.out.print(numbers);
                numbers++;
            }

            int numbers2 = 1, k = n - j - 1;
            while(numbers2 <= n - j - 1){
                System.out.print(k);
                k--;
                numbers2++;
            }
            System.out.println("*");
            j++;
        }
        System.out.println("*");        
    }
}