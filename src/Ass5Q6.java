import java.util.*;
public class Ass5Q6 {
    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer>  result =  new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i])-1;
            if(arr[index] < 0){
                result.add(Math.abs(arr[i]));
            }else{
                arr[index] = -arr[index];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        List<Integer> duplicate = findDuplicates(arr);
        System.out.println(duplicate);
    }    
}