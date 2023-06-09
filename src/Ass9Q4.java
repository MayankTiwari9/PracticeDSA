import java.util.Scanner;

public class Ass9Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int P = scanner.nextInt();

        int result = calculateExponent(N, P);
        System.out.println(result);
    }

    public static int calculateExponent(int N, int P) {
        int result = 1;

        for (int i = 1; i <= P; i++) {
            result *= N;
        }

        return result;
    }
}
