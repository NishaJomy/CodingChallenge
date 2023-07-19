import java.util.Scanner;

public class ReverseString {
    static String toReverseOfString(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse+=ch;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("The reversed string is "+toReverseOfString(str));
    }
}
