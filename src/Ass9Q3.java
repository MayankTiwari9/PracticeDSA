import java.util.Scanner;

public class Ass9Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorial(N);
        System.out.println(factorial);
    }

    public static long calculateFactorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
