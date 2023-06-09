import java.util.Scanner;

public class Ass9Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int product = 1;
        for (int i = 0; i < size; i++) {
            product *= arr[i];
        }

        System.out.println(product);
    }
}
