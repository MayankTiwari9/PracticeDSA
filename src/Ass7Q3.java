import java.util.Scanner;

public class Ass7Q3 {
    public static String addStrings(String num1, String num2){
        StringBuilder result = new StringBuilder();

        int crry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;

        while (i >= 0 || j >= 0 || crry > 0){
            int digi1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digi2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digi1 + digi2 + crry;
            crry = sum / 10;
            int digit = sum % 10;

            result.insert(0, digit);

            i--;
            j--;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num1 = s.nextLine();
        String num2 = s.nextLine();

        String sum = addStrings(num1, num2);
        System.out.println(sum);
    }
}
