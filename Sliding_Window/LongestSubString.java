package Sliding_Window;
import java.util.*;
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
    
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> chars = new HashSet<>();

        while(j < s.length()){ 
            if(!chars.contains(s.charAt(j))){
                chars.add(s.charAt(j));
                j++;
                max = Math.max(max, chars.size());
            }
            else{
                chars.remove(s.charAt(i));
                i++;
            }

        }
        return max;

    }
}
// HashSet <Character> chars = new HashSet<>();
//     int i  =0;
//     int j = 1;
//     int max_count = 1;
//     char[] arr = s.toCharArray();
//     while(j < arr.length - 1){
//         if(arr[i] != arr[j] && !(chars.contains(arr[i]))){
//             max_count++;
//             chars.add(arr[j]);
//             j++;
//         }