public class Array3 {

    public static String replaceSpace(String s, int n) {
        char[] c = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Math.min(n, c.length); i++) {
            result.append(c[i] == ' ' ? "%20" : c[i]);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(replaceSpace("Mr John Smith     ", 13));
    }
}