package BinarySearch;

public class FIndMInRotatedArr {
    public static int findMin(int[] nums) {
        int min = nums[0];
        int l = 0;
        int r = nums.length-1;
        while(l <= r){
            if(nums[l] <=nums[r]){
                    min = Math.min(min, nums[l]);
                    break;
            }
            int mid = (l + r)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid]>= nums[l]){
                l  = mid + 1;
            }
            else{
                r = mid -1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, 1, 2};
        System.out.println(findMin(arr));
    }
}
// Working solution
        // int min = Integer.MAX_VALUE;
        // int l = 0;
        // int r = nums.length -1;
        // int mid = (l + r)/ 2;
        // while(l <=r){
        //     mid = (l + r)/2;
        //     if(nums[mid] >= nums[0]){
        //         min = Math.min(min, nums[mid]);
        //         min = Math.min(min, nums[l]);
        //         l = mid + 1;
        //     }
        //     else{
        //             min = Math.min(min, nums[mid]);
        //             min = Math.min(min, nums[l]);
        //             r = mid - 1;
        //         }
        //     }
        // return min; 