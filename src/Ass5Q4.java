import java.util.*;

public class Ass5Q4 {
    public static List<List<Integer>> findMissingNumbers(int[] arr1, int[] arr2) {
        List<Integer> missingNums1 = new ArrayList<>();
        List<Integer> missingNums2 = new ArrayList<>();

        for (int num : arr1) {
            if (!contains(arr2, num)) {
                missingNums1.add(num);
            }
        }

        for (int num : arr2) {
            if (!contains(arr1, num)) {
                missingNums2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(missingNums1);
        answer.add(missingNums2);
        return answer;
    }

    private static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt(); 
        }
        List<List<Integer>> answer = findMissingNumbers(arr1, arr2);
    }
}
