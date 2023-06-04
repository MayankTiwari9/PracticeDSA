import java.util.*;
public class Ass5Q7 {
    public static int findMin(int []arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int min = findMin(arr);
        System.out.println(min);
    }
}
