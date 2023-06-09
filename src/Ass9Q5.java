import java.util.Scanner;

public class Ass9Q5 {
    public static int findMax(int[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return arr[startIndex];
        } else {
            int mid = (startIndex + endIndex) / 2;
            int leftMax = findMax(arr, startIndex, mid);
            int rightMax = findMax(arr, mid + 1, endIndex);
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxElement = findMax(arr, 0, n - 1);
        System.out.println(maxElement);
    }
}
