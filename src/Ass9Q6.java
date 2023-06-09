import java.util.Scanner;

public class Ass9Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int d = scanner.nextInt();

        int N = scanner.nextInt();

        int nthTerm = a + (N - 1) * d;

        System.out.println(nthTerm);
    }
}
