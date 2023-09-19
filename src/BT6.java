import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] array = {{1.5, 2.0, 3.0}, {4.5, 5.0, 6.0}, {7.5, 8.0, 9.0}};
        int colIndex;

        System.out.print("Nhập thứ tự của cột (tính từ 0): ");
        colIndex = scanner.nextInt();

        double colSum = calculateColumnSum(array, colIndex);
        System.out.println("Tổng của cột " + colIndex + " là: " + colSum);

        // Bước 2: Nhập mảng từ người dùng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] userArray = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử ở vị trí [" + i + "][" + j + "]: ");
                userArray[i][j] = scanner.nextDouble();
            }
        }



        // In mảng đã nhập từ người dùng
        System.out.println("Mảng đã nhập từ người dùng:");
        printArray(userArray);
    }

    // Hàm tính tổng cột của mảng 2D
    public static double calculateColumnSum(double[][] array, int colIndex) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            if (colIndex >= 0 && colIndex < array[i].length) {
                sum += array[i][colIndex];
            }
        }
        return sum;
    }

    // Hàm in mảng 2D
    public static void printArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
