import java.util.Scanner;

public class Ass7Q8 {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if ((y1 - y0) * (x - x0) != (y - y0) * (x1 - x0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] coordinates = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Point " + (i + 1) + ": ");
            coordinates[i][0] = scanner.nextInt();
            coordinates[i][1] = scanner.nextInt();
        }

        boolean isStraightLine = checkStraightLine(coordinates);
        System.out.println(isStraightLine);
    }
}
