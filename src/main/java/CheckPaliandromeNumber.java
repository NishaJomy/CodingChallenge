import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckPaliandromeNumber {
    static int checkPaliandrome(int n){
      int rev = 0;
        while (n != 0) {
           rev= rev*10+n%10;
           n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPaliandrome(n)==n)
        System.out.println("The entered number is a palindrome");
        else{
            System.out.println("The entered number is not a palindrome");
        }
    }
}
