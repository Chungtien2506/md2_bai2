import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so");
        int number =sc.nextInt();
        if(number<2){
            System.out.println(number+"khong phai so nguyen to");
        }else {
            boolean check = true;
            for(int i = 2;i<= Math.sqrt(number);i++){
                if( number%i == 0){
                    check = false;
                }
            }
            if(check)
                System.out.println(number+"la so nguyen to");
            else
                System.out.println(number+"khong la so nguyen to");
        }

    }
}
