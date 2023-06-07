import java.util.Scanner;
public class Ass7Q6 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String concatenated = s + s;
        return concatenated.contains(goal);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String goal = scanner.nextLine();
        boolean canRotate = rotateString(s, goal);
        System.out.println(canRotate);
    }
}
