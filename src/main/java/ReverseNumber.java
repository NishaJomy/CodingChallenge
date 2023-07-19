import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int num){
        int reverse =0;
        while(num>0){
        reverse=(reverse*10)+ num%10;
        num=num/10;}
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The reversed number is "+reverseNumber(num));
    }
}
