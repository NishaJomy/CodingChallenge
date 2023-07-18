import java.util.Scanner;

public class ReadFloatFromInput {
    public static void main(String[] args) {
        System.out.println("Enter a float number");
        Scanner sc = new Scanner(System.in);
        Float fl = sc.nextFloat();
        System.out.println(fl);
    }
}
