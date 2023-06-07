import java.util.Scanner;
import java.util.Stack;
public class Ass7Q7 {
    public static boolean backspaceCompare(String s, String t) {
        return processString(s).equals(processString(t));
    }

    private static String processString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        boolean areEqual = backspaceCompare(s, t);
        System.out.println(areEqual);
    }
}
