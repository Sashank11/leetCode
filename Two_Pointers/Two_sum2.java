package Two_Pointers;
import java.util.*;
public class Two_sum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int sum = 0;
        int[] invalid = {-1};
        while(i <= j){
            sum = numbers[i] + numbers[j];
            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }
            else {
                int[] output = {i + 1, j+ 1};
                return output;
            }
        }

        return invalid; 
    
    }

}