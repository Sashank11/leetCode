package Sliding_Window;
import java.util.Arrays;
import java.util.*;
public class PermutationString {
    public static boolean checkInclusion(String s1, String s2) {
        
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        checkInclusion(s1, s2);
    }
}
// doesnt work as permutation
// char[] arr1 = s1.toCharArray();
//         char[] arr2 = s2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         System.out.println(arr1);
//         System.out.println(arr2);
//         String res1 = String.copyValueOf(arr1);
//         String res2 = String.copyValueOf(arr2);
//         System.out.println(res1);
//         System.out.println(res2);
//         if(res2.contains(res1)){
//             return true;
//         }
//         else{
//             return false;
//         }