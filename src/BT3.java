import java.util.Scanner;

public class BT3 {


        public static void main(String[] args) {

            int[] array1 = new int[3];
            int[] array2 = new int[2];


            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập giá trị cho mảng 1:");
            for (int i = 0; i < array1.length; i++) {
                System.out.print("Phần tử thứ " + i + ": ");
                array1[i] = scanner.nextInt();
            }

            System.out.println("Nhập giá trị cho mảng 2:");
            for (int i = 0; i < array2.length; i++) {
                System.out.print("Phần tử thứ " + i + ": ");
                array2[i] = scanner.nextInt();
            }


            int[] array3 = new int[array1.length + array2.length];


            for (int i = 0; i < array1.length; i++) {
                array3[i] = array1[i];
            }


            for (int i = 0; i < array2.length; i++) {
                array3[array1.length + i] = array2[i];
            }


            System.out.println("Mảng 3 sau khi gộp:");
            for (int value : array3) {
                System.out.print(value + " ");
            }
        }


}
