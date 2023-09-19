import java.util.Arrays;
import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNumber ={1,2,3,4,5};

        System.out.println("nhập phần tử cần xóa (X):");
        int X = sc.nextInt();


        int index_del = -1;
        for (int i = 0; i < arrNumber.length; i++) {
            if(arrNumber[i] ==X){

                index_del =i;
                break;
            }
        }

        if(index_del !=-1){
            for (int i = index_del; i < arrNumber.length-1; i++) {
                       arrNumber[i]= arrNumber[i+1];
            }
        }
        int[] newArrNumber = new int[arrNumber.length -1];
               newArrNumber =  Arrays.copyOf(arrNumber,arrNumber.length-1 );

        // Bước 5: In ra mảng sau khi xoá
        System.out.println("Mảng sau khi xoá:");
        for (int num : newArrNumber) {
            System.out.print(num + " ");
        }
    }
}
