import java.util.Scanner;
public class Ass7Q4 {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();
            reversed.append(word);

            if (i != words.length - 1) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reversedWords = reverseWords(s);
        System.out.println(reversedWords);
    }
}
