public class Array6 {

    public static String stringCompression(String s) {
        // char + count
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            char c = s.charAt(i);
            if (i == s.length() - 1 || c != s.charAt(i+1)) {
                result.append(c + "" + count);
                count = 0;
            }
        }
        return s.length() <= result.length() ? s : result.toString();
    }


    public static void main(String[] args) {
        System.out.println(stringCompression("abcdefggggggggggggg"));
    }
}