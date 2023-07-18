import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
    }
}
