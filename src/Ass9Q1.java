import java.util.Scanner;
public class Ass9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        // Using bitwise AND operator to check if n is a power of two
        return (n & (n - 1)) == 0;
    }
}
