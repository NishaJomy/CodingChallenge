public class AddTwoBinaryString {
    public static void main(String[] args) {
        String s1 = "110";
        String s2 = "011";
        int n1 = Integer.parseInt(s1,2);
        int n2 = Integer.parseInt(s2,2);
        int sum = n1+n2;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
    }
}
