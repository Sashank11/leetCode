package Two_Pointers;
import java.util.*;
public class ValidPalin {
    public static  boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!Character.isLetterOrDigit(a) ){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(b)){
                j--;
                continue;
            }
            if(Character.toLowerCase(a) != Character.toLowerCase(b)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome("A man, a plan, a canal: Panama"));
    }
}
    //     if(s == " "){
    //         return true;
    //     }
    //     String clean = s.replaceAll("[.:,;\\s]", "");
    //     String result = clean.toLowerCase();
    //     // System.out.println(result);
    //     StringBuilder sb = new StringBuilder(result);
    //     // System.out.println(sb);
    //     String s_rev = sb.reverse().toString();
    //     // System.out.println(s_rev);
    //     if( sb == sb.reverse()){
    //         return true;
    //     }
    //     return false;
    // }