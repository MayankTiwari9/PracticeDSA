import java.util.*;
public class Ass5Q1 {
    public static int[][] convertTo2D(int []arr, int m, int n){
        if(m*n != arr.length){
            return new int[0][0];
        }

        int [][]result = new int[m][n];
        int row = 0, col = 0;

        for (int i = 0; i < arr.length; i++) {
            result[row][col] = arr[i];
            col++;

            if(col == n){
                col = 0;
                row++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t];

        for (int i = 0; i < t; i++) {
            arr[i] = s.nextInt();
        }

        int m = s.nextInt();
        int n = s.nextInt();
        int[][] result = convertTo2D(arr, m, n);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
