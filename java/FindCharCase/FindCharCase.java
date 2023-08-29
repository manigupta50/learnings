import java.util.Scanner;

public class FindCharCase {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = str.charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println(1);
        }
        else if(ch >= 'a' && ch <='z'){
            System.out.println(0);
        }else
            System.out.println(-1);

    }
}