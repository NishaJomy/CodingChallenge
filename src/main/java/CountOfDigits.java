public class CountOfDigits {
    public static void main(String[] args) {
        int n=500000;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
