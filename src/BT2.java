import java.util.Arrays;
import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNumber = {1, 2, 3, 4, 5};

        System.out.println("nhập vào số (X) cần chèn:");
        int X = sc.nextInt();
        System.out.println("nhập vào vị trí cần chèn:");
        int indexX = sc.nextInt();

        if (indexX < 0 || indexX > arrNumber.length) {
            System.out.println("vị trí index ko thể chèn vào trong mảng !!");
            return;
        }

        System.out.println(Arrays.toString(arrNumber));

        // Chèn phần tử X vào mảng
        int[] newArr = new int[arrNumber.length + 1];
        for (int i = 0; i < indexX; i++) {
            newArr[i] = arrNumber[i];
        }
        newArr[indexX] = X;
        for (int i = indexX; i < arrNumber.length; i++) {
            newArr[i + 1] = arrNumber[i];
        }


        arrNumber = newArr;

        // In ra mảng
        System.out.println("Mảng sau khi chèn phần tử:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + " ");
        }
    }
}
