import java.util.*;
public class Ass5Q8 {

    public static int[] findOriginalArray(int[] arr){
        if(arr.length % 2 != 0){
            return new int[0];
        }

        List<Integer> list  = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            if(!set.contains(num)){
                continue;
            }

            if(!set.contains(num * 2)){
                return new int[0];
            }
            list.add(num);
            set.remove(num);
            set.remove(num*2);
        }
        int []original = new int[list.size()];
        for (int i = 0; i < original.length; i++) {
            original[i] = list.get(i);
        }
        return original;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] original = findOriginalArray(arr);
        System.out.println(Arrays.toString(original));
    }
}
