import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Thi");
            System.out.println("2.Tien");
            System.out.println("3.Hung");
            System.out.println("0.Exit");
            System.out.println("nhap lua chon cua ban");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thi");
                    System.out.println("* * * * *");
                    System.out.println(" * * * *");
                    System.out.println("  * * *");
                    break;
                case 2:
                    System.out.println("Tien");
                    System.out.println("* * * * *");
                    System.out.println("* * * * ");
                    System.out.println("* * * ");
                    break;
                case 3:
                    System.out.println("Hung");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("k chon");

            }
        }
    }
}