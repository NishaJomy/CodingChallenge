import com.sun.jdi.PathSearchingVirtualMachine;

import java.net.StandardSocketOptions;


public class PrimeNumsFrom1toN {
    public static void printPrime(int N){

        int x,y,flag;

        for(x=0; x<=N;x++){
            if(x==0 ||x==1){
                continue;
            }
            flag=1;
            for(y=2;y<=x/2;y++){
                if(x%y==0){
                    flag=0;
                    break;
                }

            }
            if(flag==1) {
                System.out.println(x+" ") ;
            }
        }


    }

    public static void main(String[] args) {
        printPrime(11);
    }
}
