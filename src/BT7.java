import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] predefinedMatrix = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double sumPredefined = calculateDiagonalSum(predefinedMatrix);
        System.out.println("Tổng đường chéo chính của ma trận có sẵn là: " + sumPredefined);


        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] userMatrix = new double[size][size];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        double sumUser = calculateDiagonalSum(userMatrix);
        System.out.println("Tổng đường chéo chính của ma trận của người dùng là: " + sumUser);
    }

    public static double calculateDiagonalSum(double[][] matrix) {
        int size = matrix.length;
        double sum = 0.0;

        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
