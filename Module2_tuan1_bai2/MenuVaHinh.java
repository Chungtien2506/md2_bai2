import java.util.Scanner;

public class MenuVaHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.hinh chu nhat");
            System.out.println("2.tam giac vuong");
            System.out.println("3.tam giac vuong 1");
            System.out.println("4.tam giac deu");
            System.out.println("0.Exit");
            System.out.println("nhap lua chon cua ban");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hinh chu nhat");
                    int width = 20;
                    int height = 5;

                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("tam giac vuong ");
//                    int width = 5;
//                    int height = 5;

                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("tam giac vuong 2");

                    for (int i =10;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

                    break;
                case 4:
                    System.out.println("tam giac deu");
                    for (int i = 1; i <= 4; i++) {
                        for (int j = 1; j <= 4 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("k chon");


            }
        }
    }
}

