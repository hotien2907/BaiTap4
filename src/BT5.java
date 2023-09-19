import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập vào giá trị: " + (i+1) +"là: ");
            arr[i] = sc.nextInt();
        }


        int mixValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < mixValue) {
                mixValue = arr[i];
            }
        }
        System.out.println("giá trị nhỏ nhất là: "+ mixValue);
    }
}
