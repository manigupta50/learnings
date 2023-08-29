package learnings.java.DiamondOfStars;

import java.util.Scanner;

public class DiamondOfStars {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0)
            System.out.print("Not a valid number");
        else{
            int i = 1;
            while(i <= n/2 + 1){

                int spaces = 1;
                while(spaces <= (n/2) - i + 1){
                    System.out.print(" ");
                    spaces++;
                }

                int stars = 1;
                while(stars <= i){
                    System.out.print("*");
                    stars++;
                }

                int stars2 = 1;
                while(stars2 < i){
                    System.out.print("*");
                    stars2++;
                }
                System.out.println();
                i++;
            }

        
            int j = 1;
            while(j <= n/2){

                int spaces = 1;
                while(spaces <= j){
                    System.out.print(" ");
                    spaces++;
                }

                int stars = 1;
                while(stars <= n - j - (n/2)){
                    System.out.print("*");
                    stars++;
                }

                int stars2 = 1;
                while(stars2 <= (n/2) - j){
                    System.out.print("*");
                    stars2++;
                }
                System.out.println();
                j++;
            } 
        }
    }
}       