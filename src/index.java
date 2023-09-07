

//Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
import java.text.DecimalFormat;
import java.util.Scanner;

    public class index {
    public static void main(String[] args) {
//        Scanner number1 = new Scanner(System.in);
//        Scanner number2 = new Scanner(System.in);
//        System.out.println("nhap a");
//        int a = number1.nextInt();
//        System.out.println("nhap b");
//        int b = number2.nextInt();
//        if (a % b == 0) {
//            System.out.println(a + " co chia het " + b );
//        } else {
//            System.out.println(a + " ko chia het " + b );
//        }


        //  Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner age = new Scanner(System.in);
//        System.out.println("nhap diem");
//        int a = age.nextInt();
//        if (a > 99) {
//            System.out.println("thieu dieu kien tot nghiep");
//        } else {
//            System.out.println("thi lai");
//        }

        //        Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra
        //        màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0

//        Scanner soNguyen = new Scanner(System.in);
//        int a = soNguyen.nextInt();
//                if (a < 10) {
//                    System.out.println("lon hon ");
//                } else {
//                    System.out.println("nho hon ");
//                }

        //Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó

//                Scanner soNguyen0 = new Scanner(System.in);
//                Scanner soNguyen1 = new Scanner(System.in);
//                Scanner soNguyen2 = new Scanner(System.in);
//                int a = soNguyen0.nextInt();
//                int b = soNguyen1.nextInt();
//                int c = soNguyen2.nextInt();
//                if (a > b && b > c) {
//                    System.out.println( a + "gia tri lon nhat");
//                } else if (b > a && a > c) {
//                    System.out.println(b + "gia tri lon nhat");
//                } else {
//                    System.out.println(c + "gia tri lon nhat");
//                }

        //        Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra,
        //        điểm thi giữa kỳ, điểm thi cuối kỳ


//        Scanner diemKiemTra = new Scanner(System.in);
//        Scanner diemThiGiua = new Scanner(System.in);
//        Scanner diemThiCuoi = new Scanner(System.in);
//        int a = diemKiemTra.nextInt();
//        int b = diemThiGiua.nextInt();
//        int c = diemThiCuoi.nextInt();
//        int d = (a + b + c) / 3;
//        if (d > 9) {
//            System.out.println("truot");
//        } else {
//            System.out.println("ngu");
//        }

        //        Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng.

//        Scanner hoaHong = new Scanner(System.in);
//        int a = hoaHong.nextInt();
//        if (a > 0 && a <= 25 ) {
//            System.out.println(a * 20);
//        }


        //        Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho.

//        Scanner cuocDT = new Scanner(System.in);
//        int a = cuocDT.nextInt();
//        if (a > 0 && a <= 10) {
//            System.out.println(a * 1.222);
//        }

        //        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F

//        Scanner doC = new Scanner(System.in);
//        double c = doC.nextInt();
//        double f =  c * 9/5 +32;
//        System.out.println(f);


//        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner m = new Scanner(System.in);
//        double met = m.nextInt();
//        double feet = met * 3.2808;
//        System.out.println(feet);


//        Bài 3: Tính diện tích hình vuông khi biết cạnh a.

//        Scanner a = new Scanner(System.in);
//        System.out.println("nhap so vao");
//        int number = a.nextInt();
//        int dienTich = number * 2;
//        System.out.println(dienTich);

//        Bài 4: Tính diện tích hình  chữ nhật khi biết 2 cạnh a, b.
//        Scanner chieuDai = new Scanner(System.in);
//        Scanner chieuRong = new Scanner(System.in);
//        System.out.println("chieu dai");
//        int cD = chieuDai.nextInt();
//        System.out.println("chieu rong");
//        int cR = chieuRong.nextInt();
//        int kq = cD * cR;
//        System.out.println(kq);


//        Bài 5: Tính diện tích tam giác vuông khi biết 2 cạnh kề a, b.

//        Scanner chieuCao = new Scanner(System.in);
//        Scanner canhDay = new Scanner(System.in);
//        System.out.println("so chieu cao");
//        int cC = chieuCao.nextInt();
//        System.out.println("so canh day");
//        int cD = canhDay.nextInt();
//        double a = 0.5;
//        double kq = a * cC * cD;
//        System.out.println("ket qua " + kq );

//        Bài 6: Giải phương trình bậc 1.

//       Scanner a = new Scanner(System.in);
//       Scanner b = new Scanner(System.in);
//        System.out.println("nhap gia tri a : ");
//        int soA = a.nextInt();
//        System.out.println("nhap gia tri b : ");
//        int soB = b.nextInt();
//        System.out.println("chuong trinh ban nhap vao : " + soA + "x + " + soB);
//        double x;
//        DecimalFormat decimalFormat = new DecimalFormat();
//        Scanner scanner = new Scanner(System.in);
//        if (soA == 0) {
//            if (soB == 0) {
//                System.out.println("phuong trinh vo so nghiem ");
//            } else {
//                System.out.println("phuong trinh vo nghiem");
//            }
//            } else {
//                x = (double) - soB / soA;
//                System.out.println("phuong trinh co nghiem x la : " + decimalFormat.format(x));
//        }


//        Bài 7: Giải phương trình bậc 2.

//        Scanner a = new Scanner(System.in);
//        Scanner b = new Scanner(System.in);
//        Scanner c = new Scanner(System.in);
//        System.out.println("nhap gia tri a : ");
//        int a1 = a.nextInt();
//        System.out.println("nhap gia tri b : ");
//        int b1 = b.nextInt();
//        System.out.println("nhap gia tri c : ");
//        int c1 = c.nextInt();
//        double x = Math.pow(b1,2) - 4 * a1 * c1;
//        double d1 = java.lang.Math.sqrt(x);
//            double n1 = ( -b1 + d1 ) / 2* a1;
//            double n2 = ( -b1 - d1 ) / 2* a1;
//
//            if (x > 0) {
//                System.out.println("phuong trinh co nghiem 1 " + n1 + "nghiem 2 " + n2 );
//            } else if (x < 0 ){
//                System.out.println("phuong trinh vo nghiem ");
//            } else {
//                System.out.println("phuong trinh vi nghiem " + - b1 / 2 * a1);
//            }


//        Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.

//        Scanner number = new Scanner(System.in);
//        System.out.println("nhap so tuoi");
//        int a = number.nextInt();
//        for (int i = 1; i <= 120; i++) {
//            if (a < 120 ) {
//                System.out.println("thieu tuoi");
//            } else {
//                return;
//            }
//        }

        // lam hinh chu nhat

//        int height;
//        int width;
//        int i;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("height = ");
//        height = sc.nextInt();
//        System.out.print("width = ");
//        width = sc.nextInt();
//
//        for(i = 1; i <= height; i++){
//            for(int j = 1; j <= width; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println("");
//        }
//
//        sc.close();

        // hinh tam giac vuong

//        int height;
//        int width;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("height : ");
//        height = sc.nextInt();
//        System.out.println("width : ");
//        width = sc.nextInt();
//
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//        sc.close();
        
        // hinh tam giac vuong nguoc
        
        int height;
        int width;
        Scanner sc = new Scanner(System.in);
        System.out.println("height : ");
        height = sc.nextInt();
        System.out.println("width");
        width = sc.nextInt();

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}















