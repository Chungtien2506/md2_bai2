import java.util.Scanner;

public class uocchung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a");
        a = input.nextInt();
        System.out.println("nhap so b");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if( a== 0 || b == 0){
            System.out.println("k co boi  chung");
            }
        while (a!=b){
            if(a>b)
                a = a - b ;
            else
                b = b - a;
        }
        System.out.println("uoc chung"+ a);

    }
}
