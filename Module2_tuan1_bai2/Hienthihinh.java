public class Hienthihinh {
    public static void main(String[] args) {
//        int width = 20;
//        int height = 5;
//
//        for (int i =0;i<height;i++){
//            for (int j=0;j<width;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int width = ;
//        int height = 10;
//
//        for (int i =0;i<height;i++){
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        int width = 20;
//        int height = 10;
//
//        for (int i =10;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int height  = 5;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
