import java.util.*;
public class Ass5Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextInt(); 
        }
        int count = 0;
        for (int num1 : arr1) {
            boolean valid = true;
            for (int num2 : arr2) {
                if (Math.abs(num1 - num2) <= d) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                count++;
            }
        }
        System.out.println(count);

    }
}
