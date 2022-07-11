package Arrays_Hashing;
import  java.util.*;
public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        char[] ch = new char[s.length()];
        char[] ch2 = new char[t.length()];
        for(int i = 0; i<s.length(); i++){
            ch[i] =  s.charAt(i);
        }
        for(int i = 0; i<t.length(); i++){
            ch2[i] =  t.charAt(i);
        }

        Arrays.sort(ch);
        Arrays.sort(ch2);
        boolean ret = Arrays.equals(ch, ch2);
        return ret;

    }
}
