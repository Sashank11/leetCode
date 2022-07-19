package Two_Pointers;
import java.util.*;
public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++){
            if(i == 0|| (i>0 && nums[i] != nums[i -1])){
                int target = 0 - nums[i];
                int left = i + 1;
                int right = nums.length - 1;
                while( left < right){
                    if(nums[left] + nums[right] == target){
                        ArrayList<Integer> minires = new ArrayList<>();
                        minires.add(nums[i]);
                        minires.add(nums[left]);
                        minires.add(nums[right]);
                        result.add(minires);
                        while(left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if( nums[left] + nums[right] > target){
                        right--;
                    }
                    else{
                        left++;
                    }

                }

            }
        }
    return result;
    }
}
//  TLD
// List<List<Integer>> result = new ArrayList<List<Integer>>();
//         Arrays.sort(nums);
//         int i = 0; int j = nums.length -1;
//         for(int k = 0; k < nums.length; k++){
//             int target = nums[k];
//         while( i < j){
//             if( nums[i] + nums[j] > target){
//                 j--;
//             }
//             if(nums[i] + nums[j] < target){
//                 i++;
//             }
//             else{
//                 ArrayList<Integer> curr = new ArrayList<>();
//                 curr.add(nums[i]);
//                 curr.add(nums[j]);
//                 curr.add(target);
//                 result.add(curr);
//             }
//         }
//     }
//     return result;
