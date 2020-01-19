public class Array5 {

    public static boolean isOneEditAway(String s1, String s2) {
        int numDiff = 0;
    
        if (s1.length() == s2.length()) {
            // s1 = s2 -> replace
            // if there's 0 or 1 char diff, true o.w. false
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    numDiff++;
            }
        } else {
            // s1 > s2 -> remove/insert
            // if diff, continue, only once
            int i = 0, j = 0;
            while (i < s1.length() && j < s2.length()) {
                if (s1.charAt(i) != s2.charAt(j)) {
                    if (s1.length() > s2.length()) {
                        i++;
                        numDiff++;
                    } else {
                        j++;
                        numDiff++;
                    }
                } else {
                    i++;
                    j++;
                }
            }
        }
        return numDiff <= 1;
    }
    
    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "ple"));
        System.out.println(isOneEditAway("pales", "pale"));
        System.out.println(isOneEditAway("pale", "bale"));
        System.out.println(isOneEditAway("pale", "bake"));

    }
}