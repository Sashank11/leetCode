package Arrays_Hashing;
import java.util.*;
public class LongestSequence{
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for(int num : nums){
            num_set.add(num);
        }
        int max_seq_length = 0;
        for(int i = 0; i<nums.length; i++){
            int current_num = nums[i];
            int current_seq_length = 1;
            if(!num_set.contains(current_num -1)){
                while(num_set.contains(current_num+1)){
                    current_num +=1;
                    current_seq_length +=1;
                }
            }
            max_seq_length = Math.max(current_seq_length, max_seq_length);
        }
        return max_seq_length;
    }
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));

    }
}