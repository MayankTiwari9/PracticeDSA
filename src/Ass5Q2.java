import java.util.*;
public class Ass5Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 0;
        while(n >= k){
            n -= k;
            k++;
        }
        System.out.println(k-1);
    }
}
