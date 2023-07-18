public class SwapTwoNums {
    public static void swapNumbers(int num1,int num2){
        System.out.println("The numbers before swapping are num1 = "+num1+" and num2 = "+num2);
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The numbers after swapping are num1 = "+num1+" and num2 = "+num2);
    }

    public static void main(String[] args) {
        swapNumbers(10,20);
    }
}
