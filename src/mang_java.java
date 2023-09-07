import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    }

    public class mang_java {
        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            b = 5;
            System.out.println(a); // giu nguyen gia tri a
            System.out.println(b); // gia tri b bi doi thanh 5

            Person p1 = new Person("xAng", 18);
            Person p2 = new Person("cAn", 18);
            Person p3 = p1;
            p3.name = "fUcK_yOu";
            System.out.println(p1);
            System.out.println(p3);
            System.out.println( p1 == p2 );
            System.out.println( p1 == p3 );
        }
    }
class main2 {
    public static void main(String[] args) {
        int a = 1;
        changPri(a);
        System.out.println(a);

        Person p2 = new Person("xAng", 22);
        changObj(p2);
        System.out.println(p2);
    }
    public static void changPri(int a) {
        a = 10;
        // in ra a = 1;
    }

    public static void changObj(Person p) {
        p.name = "turLajnh";
    }
}
  // them phan tu vao mang
class main3 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9};  // length = 3; size = 3
        int[] arr2 = new int[4]; // length = 4; size = 0
        // khi khai bao bang tu khoa new no se tao 1 mang co do dai duoc chi dinh va trong mang chua cac gia tri mac dinh
        // int : 0, double : 0,0, String : null, boolen : true,false

        arr2[0] = 10;
        arr2[2] = 25;
        System.out.println(Arrays.toString(arr2));
    }
}
  // nhap do dai mang ; nhap so luong phan tu
class main4 {
    //{
//          //yeu cau nhap vao do dai mang va nhap cac phan tu sau do in ra mang do
//          Scanner input = new Scanner(System.in);
//          System.out.println("nhap do dai mang");
//          int length = input.nextInt();
//          int [] arr = new int[length];
//          int size = 0;
//          while (size != length) {
//              System.out.println("nhap phan tu thu : " + size);
//              int element = input.nextInt();
//              arr[size] = element;
//              size++;
//          }
//          System.out.println(Arrays.toString(arr));
//      }
    public static void main(String[] args) {
          int[] arr = new int[7];
          int size = 0;
          size = addElement(arr, -3, size); // 1
          size = addElement(arr, 99, size);
          size = addElement(arr, 69, size);
          size = addElement(arr, -5, size);
          size = addElement(arr, -7, size);

          System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
          System.out.println("Size mảng là: " + size);
          //System.out.println("Vị trí cả phần tử 99 là: " + searchByElement(arr, 99, size));

          size = delete(arr, 69, size);
          System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));
          System.out.println("Size mảng là: " + size);
      }
      public static int delete(int[] arr, int element, int size) {
          int index = searchByElement(arr, element, size);
          for (int i = index; i < size; i++) {
              arr[i] = arr[i + 1];
          }
          size--;
          return size;
      }

      public static int addElement(int[] arr, int element, int size) {
          arr[size] = element;
          size++;
          return size;
      }

      public static int searchByElement(int[] arr, int elementSearch, int size) {
          for (int i = 0; i < size; i++) {
              if(elementSearch == arr[i]) {
                  return i;
              }
          }
          return -1;
      }

  }

