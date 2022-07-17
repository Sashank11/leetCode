package Arrays_Hashing;
import java.util.*;
public class Prod_arr {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] output = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;
        for(int i = 1; i < nums.length-1; i++){
            left[i] = nums[i - 1] * left[i - 1];
        }
        for( int i = nums.length-2; i >= 0; i-- ){
            right[i] = nums[i + 1] * right[i + 1];
        }


        for( int i = 0; i < nums.length; i++){
            output[i] = right[i] * left[i];
        }
        return output;
    }
}

// more optimal soln:
// int N = nums.length;
//         int[] output = new int[N];
//         output[0] = 1;
        
//         for(int i = 1; i < N; i++){
//             output[i] = nums[i-1] * output[i - 1];
//         }
//         int R = 1;
//         for(int i = N -1; i >= 0; i--){
//             output[i] = output[i] * R;
//             R = nums[i] * R;
//         }
//         return output;
