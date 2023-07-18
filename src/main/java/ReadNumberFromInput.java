import java.util.Scanner;

public class ReadNumberFromInput {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number is "+num);
    }
}
