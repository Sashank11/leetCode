package BinarySearch;
import java.util.*;
public class BInSearch {
    public static int search(int[] nums, int target) {
        int l =  0;
        int r = nums.length - 1;
        while(l <= r){
            int mid = (l + r) / 2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){  
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(search(nums, 5));
    }
    }
// int pivot = nums.length/2;
//         if(pivot == target){
//             return pivot;
//         }
//         if(target  > nums.length/2){
//             search(Arrays.copyOfRange(nums, pivot,nums.length), target);
//         }
//         if(target < nums.length/2){
//             search(Arrays.copyOfRange(nums, 0, pivot - 1), target);
//         }
//         return -1;
//         }       