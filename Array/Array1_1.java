import java.util.HashSet;

// Is Unique
public class Array1_1 {

    public static boolean isUnique(String s) {
        String lower = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (lower.toLowerCase().charAt(i) == lower.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static boolean isUnique2(String s) {
        HashSet<Character> c = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!c.add(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("Hello World"));
        System.out.println(isUnique("abcdefg"));

        System.out.println(isUnique2("Hello World"));
        System.out.println(isUnique2("abcdefg"));
    }
}