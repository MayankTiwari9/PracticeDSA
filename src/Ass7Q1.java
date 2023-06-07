import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ass7Q1 {
    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            } else{
                sMap.put(sChar, tChar);
            }
            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar) != sChar){
                    return false;
                }
            } else{
                tmap.put(tChar, sChar);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        boolean isIsomorphic = isIsomorphic(s, t);
        System.out.println(isIsomorphic);
    }
}
