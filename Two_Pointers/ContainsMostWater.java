package Two_Pointers;
import java.util.*;
public class ContainsMostWater {
    public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length - 1;
        while( i < j){
            if( height[i]  < height[j]){
                area = Math.max(area, height[i] * (j - i));
                i++;
            }
            else{
                area = Math.max(area, height[j] * (j - i));
                j--;
            }
        }
        return area;

    }
}
