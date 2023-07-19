import java.util.Scanner;

public class PrintArrayElements {
    public static void main(String[] args) {
        //int arr[] = new int[5];//declared and instantiated

//        arr[0]=23;(initialised)
//        arr[1]=2;
//        arr[2]=237;
//        arr[3]=123;
//        arr[4]=23;
        //int arr1[]={2,3,4,5,6};declared,instantiated and initialised
        int result[]=new int[5];

        for(int i=0;i<5;i++){
            Scanner sc =new Scanner(System.in);
           result[i] = sc.nextInt();

        }
        System.out.println("The array elements are :");
        for(int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");}
    }

}
