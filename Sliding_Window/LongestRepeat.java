package Sliding_Window;
import java.util.*;
public class LongestRepeat {
    public static int characterReplacement(String s, int k) {
            int n = s.length();
            int i = 0;
            int[] char_counts = new int[26];
            int max = 0;
            int max_count = 0;
            for(int j = 0; j < n; j++){
                char_counts[s.charAt(j) - 'A']++;
                int current_char_count = char_counts[s.charAt(j) - 'A'];
                max_count = Math.max(max_count, current_char_count);

                while(j  - i - max_count + 1 > k){
                    char_counts[s.charAt(i) - 'A']--;
                    i++;
                }
                max = Math.max(max, j - i + 1);
            }
            return max;
        }
    }

//  int i = 0;
//         int j = 0;
//         // int max = 0;
//         int count = 1;
//         HashSet<Character> chars = new HashSet<>();
//         chars.add(s.charAt(0));
//         while(k > 0 || j < s.length() ) {
//             if(chars.contains(s.charAt(j))){
//                 count++;
//                 // max = Math.max(max, count);
//                 j++;
//                 i++;
//             }
//             else{
//                 k--;
//                 count++;
//             }
//             }
//             return count;