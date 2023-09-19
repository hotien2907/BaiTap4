import java.util.Scanner;

public class BT8 {

        public static void main(String[] args) {

            String str = " Chuc mung nam moi";


            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập ký tự cần đếm: ");
            char kyTu = scanner.next().charAt(0);


            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == kyTu) {
                    count++;
                }
            }

            System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + count);
        }
}
