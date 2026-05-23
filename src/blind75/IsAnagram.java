package blind75;

import java.util.Arrays;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] sArr = s.toLowerCase().toCharArray();
        char [] tArr = t.toLowerCase().toCharArray();
        Arrays.sort( sArr );
        Arrays.sort( tArr );
        if(Arrays.equals(sArr, tArr)) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        String t = "abcdefg";
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram(s, t));
    }
}
