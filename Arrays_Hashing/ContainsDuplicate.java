package Arrays_Hashing;
import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hash_set = new HashSet<Integer>();
        for(int i : nums){
            if(hash_set.contains(nums[i])){
                return true;
            }
            else{
                hash_set.add(nums[i]);
            }
        }
        return false;

    }
}
