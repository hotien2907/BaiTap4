import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double[][] matrix = {
                    {1.2, 5.0, 2.7},
                    {4.2, 3.1, 1.8},
                    {7.3, 8.9, 9.4}
            };

            double maxElement = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > maxElement) {
                        maxElement = matrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            System.out.println("Phần tử lớn nhất của ma trận là " + maxElement +
                    " ở tọa độ (" + maxRow + ", " + maxCol + ")");

            System.out.println("Nhập số hàng của ma trận:");
            int rows = scanner.nextInt();
            System.out.println("Nhập số cột của ma trận:");
            int cols = scanner.nextInt();

            double[][] userMatrix = new double[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println("Nhập giá trị cho phần tử tại hàng " + (i + 1) +
                            " và cột " + (j + 1) + ":");
                    userMatrix[i][j] = scanner.nextDouble();
                }
            }

            maxElement = userMatrix[0][0];
            maxRow = 0;
            maxCol = 0;

            for (int i = 0; i < userMatrix.length; i++) {
                for (int j = 0; j < userMatrix[i].length; j++) {
                    if (userMatrix[i][j] > maxElement) {
                        maxElement = userMatrix[i][j];
                        maxRow = i;
                        maxCol = j;
                    }
                }
            }

            System.out.println("Phần tử lớn nhất của ma trận nhập từ người dùng là " +
                    maxElement + " ở tọa độ (" + maxRow + ", " + maxCol + ")");

    }
}
