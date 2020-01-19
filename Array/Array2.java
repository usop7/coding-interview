public class Array2 {

    public static boolean isPermutation(String s1, String s2) {
        String a, b;
        if (s1.length() > s2.length()) {
            a = s1;
            b = s2;
        } else {
            a = s2;
            b = s1;
        }

        int count = 0;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count == b.length();
    }

    public static boolean isSubset(String s1, String s2) {
        String a, b;
        if (s1.length() > s2.length()) {
            a = s1;
            b = s2;
        } else {
            a = s2;
            b = s1;
        }

        for (int i = 0; i < a.length() - b.length(); i++) {
            if (a.substring(i, i + b.length()).equals(b))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPermutation("hellot", "hi hello world"));
    }
}