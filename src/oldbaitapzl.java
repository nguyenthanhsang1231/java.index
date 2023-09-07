import java.util.Arrays;
import java.util.Scanner;

public class oldbaitapzl {
    public static void main(String[] args) {
//        Scanner number1 = new Scanner(System.in);
//        Scanner number2 = new Scanner(System.in);
//        System.out.println("nhap gia tri a");
//        int a = number1.nextInt();
//        System.out.println("nhap gia tri b");
//        int b = number2.nextInt();
//        if (a % b == 0) {
//            System.out.println(a + " la so chia het cho " + b );
//        } else {
//            System.out.println(a + "so k chia het" + b );
//        }

//        Scanner age = new Scanner(System.in);
//        System.out.println("so tuoi cua ban");
//        int tuoi = age.nextInt();
//        if (tuoi >= 16) {
//            System.out.println("du tuoi vao lop 10");
//        } else {
//            System.out.println("k du tuoi len lop");
//        }

        // hinh chu nhat

//       int height;
//       int width;
//       int i;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("height : ");
//        height = sc.nextInt();
//        System.out.println("width : ");
//        width = sc.nextInt();
//        for (i = 0; i <= height; i++) {
//            for (int j = 0; j <= width; j++) {
//                System.out.print("| ");
//            }
//            System.out.println("");
//        }
//            sc.close();

// them hoac thay gia tri vao trong mang
//        int[] arr = new int[6];
//        arr[4] = 15;
//        arr[2] = 13;
//        arr[5] = 32;
//        System.out.println(Arrays.toString(arr));


        // lam hinh chu nhat
//        int height;
//        int width;
//        int i;
//        Scanner nupAn = new Scanner(System.in);
//        System.out.println("nhap height : " );
//        height = nupAn.nextInt();
//        System.out.println("nhap width : " );
//        width = nupAn.nextInt();
//        for (i = 0; i <= height; i++) {
//            for (int j = 0; j < width; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//        nupAn.close();
        int x = -1, a[] = {1,2,3,4};
        for(int i=0;i<a.length;i++){
            if(a[i] < x){
                x = a[i];
            }
        }
        System.out.println(x);
    }
}
