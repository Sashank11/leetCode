package BinarySearch;
import java.util.*;
public class Matrix2DSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lrow = 0;
        int rrow = matrix.length- 1;
        int n = 0;
        while(lrow < rrow){
            n = (lrow + rrow)/2;
            if( matrix[n][0]> target){
                rrow = n;
            }
            else if( matrix[n][matrix[0].length-1]< target){
                lrow = n + 1;
            }
            else break;
        }
        
        if(Arrays.binarySearch(matrix[lrow + rrow /2], target) >= 0)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 20));
    }
}
//  for(int i = 0; i < matrix.length; i ++){
//             int l = 0; int r = matrix[i].length - 1;
//             while(l <= r){
//                 int mid = (l + r) / 2;
//                 if(target == matrix[i][mid]){
//                     return true;
//                 }
//                 if(target > matrix[i][mid]){
//                     l = mid + 1;
//                 }
//                 else{
//                     r = mid - 1;
//                 }
//             }
//         }
//         return false;