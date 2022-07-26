package Stackz;
import java.util.*;
public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];  
        Stack<Integer> temp = new Stack<>();

        for(int i = 0; i < temperatures.length; i ++){
            while(!temp.isEmpty() && temperatures[i]> temperatures[temp.peek()]){
                int prevDay = temp.pop();
                output[prevDay] = i - prevDay;
            }
            temp.push(i);
        }
        return output;










    
    }
}




// for(int i = temperatures.length-1; i >= 0; i--){
//                 temp.push(temperatures[i]);
//         }
//         while(!temp.isEmpty()){
//             int i = 0;
//             int count = 1;
//             int curr  = temp.pop();
//             if(temp.peek() > curr){
//                 output[i] = count;
//                 break;
//             }
//             else{ 
//                 temp.pop();
//                 count++;

//             }
//             i++;
//         }