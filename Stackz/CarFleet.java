package Stackz;
import java.util.*;
public class CarFleet {
        public static int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> res = new Stack<>();
        int[][] combine = new int[speed.length][2];
        for(int i = 0; i < position.length; i++){
            combine[i][0] = position[i];
            combine[i][1] = speed[i];

        }
        Arrays.sort(combine, java.util.Comparator.comparingInt(o -> o[0]));


        for(int i = combine.length - 1; i >= 0; i--){
            double currentTime = (double) (target - combine[i][0])/ combine[i][1]; 
            if(!res.isEmpty() && currentTime <= res.peek() ){
                continue;
            }
            else{
                res.push(currentTime);
            }
        }
        return res.size();

        
    }
    public static void main(String[] args) {
        int[] postion = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(carFleet(12, postion, speed));
    }
}
