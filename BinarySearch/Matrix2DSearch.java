package BinarySearch;

public class Matrix2DSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i ++){
            int l = 0; int r = matrix[i].length - 1;
            while(l <= r){
                int mid = (l + r) / 2;
                if(target == matrix[i][mid]){
                    return true;
                }
                if(target > matrix[i][mid]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix, 21));
    }
}
