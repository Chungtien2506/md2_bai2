import java.util.Scanner;

public class tienlai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("so tien gui");
        money = input.nextDouble();
        System.out.println("so thang gui");
        month = input.nextInt();
        System.out.println("so tien lai");
        interestRate = input.nextDouble();
        double tongtienlai = 0;
        for (int  i = 0;i<month;i++){
            tongtienlai+= money*(interestRate/100)/12*month;
            System.out.println("tong tien lai:" + tongtienlai);
        }
    }
}
