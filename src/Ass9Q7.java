import java.util.*;

public class Ass9Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> permutations = generatePermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(input.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(char[] chars, int index, List<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(String.valueOf(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                generatePermutationsHelper(chars, index + 1, permutations);
                swap(chars, index, i); // backtrack
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
