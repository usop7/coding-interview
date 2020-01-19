import java.util.HashMap;

public class Array4 {

    public static boolean canBePalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int num = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') continue;
            num++;
            map.put(c[i], map.get(c[i]) == null ? 1 : map.get(c[i]) + 1);
        }

        boolean isOddLength = (num % 2 == 1);
        int numOdd = 0;
        for (int x : map.values()) {
            if (x % 2 != 0)
                numOdd++;
        }
        return (isOddLength && numOdd == 1) || (!isOddLength && numOdd == 0);
        
    }
    public static void main(String[] args) {
        System.out.println(canBePalindrome("abbcba"));
    }
}