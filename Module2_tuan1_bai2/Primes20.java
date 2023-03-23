import java.util.Scanner;

public class Primes20 {
    public static void main(String[] args) {
        int count = 0;
       for (int i =1;i<=200;i++){
           if( check(i) & count <20){
               System.out.println(i);
               count++;
           }
       }
    }
    public static boolean check(int n){
        if(n<2){
            return false;
        }
        for (int i = 2;i*i<=n;i++){
            if (n%i == 0){
                return  false;
            }
        }
        return true;
    }
}


