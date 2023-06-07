import java.util.*;
public class Ass7Q2 {
    public static boolean isStrobogrammatic(String num){
        Map<Character, Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        
        int left = 0;
        int right = num.length()-1;
        
        while (left <= right){
            char leftDigit = num.charAt(left);
            char rightDigit = num.charAt(right);
            
            if(!map.containsKey(leftDigit) || map.get(leftDigit) != rightDigit){
                return false;
            }
            left++;
            right--;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        boolean result = isStrobogrammatic(num);
        System.out.println(result);
    }
}
