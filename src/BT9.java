public class BT9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 25, 30, 23, 30};

        int max1 = 0;
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2) {
                max1 = max2;
                max2 = arr[i];
            } else if (arr[i] > max1 && arr[i] < max2) {
                max1 = arr[i];
            }
        }

        System.out.println("Phần tử lớn thứ 2 là: " + max1);
    }
}
