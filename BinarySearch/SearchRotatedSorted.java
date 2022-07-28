package BinarySearch;

public class SearchRotatedSorted {
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <=r){
            int mid = (l + r) /2;
            if(target == nums[mid]){
                return mid;
            }

            // left sorted portion
            if(nums[l] <= nums[mid]) {
                if(target > nums[mid] || target < nums[l]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                

                }
            }
            // right sorted portion
            else{
                if(target < nums[mid]  || target > nums[r]){
                    r = mid -1;
                }
                else{
                    l = mid + 1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {9,1,2,3,4,5,6, 7, 8};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
//  int pivot = 0;
//         for(int i =1; i < nums.length-1; i++){
//             if(nums[i] > nums[i-1]){
//                 continue;
//             }
//             else{
//                 pivot = i - 1;
//             }
//         }
//         System.out.println(pivot);
//         int l = 0;
//         int r = pivot - 1;
//         int mid = (l + r)/2;
//         if(target == nums[pivot]){
//             return pivot;
//         }
//         if(target > nums[nums.length-1]){
//             while(l <= r){
//                 if(target> nums[mid]){
//                     l = mid + 1;
//                 }
//                 else if(target < nums[mid]){
//                     r = mid - 1;
//                 }
//                 else if(target == nums[mid]){
//                     return mid;
//                 }   
//             }
//             return - 1;
//         }
//         else{
//             int left = pivot;
//             int right = nums.length - 1;
//             int middle = (left + right) /2;
//             while(left <= right){
//                 if(target == nums[middle]){
//                     return middle;
//                 }
//                 else if(target > nums[middle]){
//                     left = middle + 1;
                    
//                 }
//                 else{
//                     right = middle - 1;
//                 }
//             }
//         }
//         return  -1;
// 188/195
// int l = 0;
//         int r = nums.length - 1;
//         int mid = (int) Math.ceil( (double) (l + r)/2);
//         if(target == nums[mid]){
//             return mid;
//         }
//         if(target == nums[l]){
//             return l;
//         }
//         if(nums[l] <= nums[mid]){
//             if(target >= nums[mid]){
//                 l = mid;
//             while(l <= r){
//             mid = (l + r)/2;
//             if(target == nums[mid]){
//                 return mid;
//             }
//             else if( target > nums[mid]){
//                 l = mid + 1;
//             }
//             else{
//                 r = mid - 1;
//             }

//         }
//             }
//         else{
//                 if(target >= nums[l]){
//                     r = mid;
//                     l = 0;
//                     while(l <= r){
//                         mid = (l + r)/2;
//                         if(target == nums[mid]){
//                             return mid;
//                             }
//                         else if( target > nums[mid]){
//                             l  = mid + 1;
//                         }
//                         else{
//                             r = mid - 1;
//                         }
//                     }
//                 }
//                 else{
//                     l = mid + 1;
//                     r = nums.length-1;
//                     while(l <= r){
//                         mid = (l + r)/2;
//                         if(target == nums[mid]){
//                             return mid;
//                             }
//                         else if( target > nums[mid]){
//                             l  = mid + 1;
//                         }
//                         else{
//                             r = mid - 1;
//                         }
//                     }
//                 }

//         }
//     }
//         else{
//             if(target <= nums[mid]){
//                 r = mid;
//                 l = 0;
//                 while(l <= r){
//                         mid = (l + r)/2;
//                         if(target == nums[mid]){
//                             return mid;
//                             }
//                         else if( target > nums[mid]){
//                             l  = mid + 1;
//                         }
//                         else{
//                             r = mid - 1;
//                         }
//                     }
//             }
//             else{
//                 if(target > nums[nums.length-1]){
//                     l = 0;
//                     r = mid -1;
//                     while(l <= r){
//                         mid = (l + r)/2;
//                         if(target == nums[mid]){
//                             return mid;
//                             }
//                         else if( target > nums[mid]){
//                             l  = mid + 1;
//                         }
//                         else{
//                             r = mid - 1;
//                         }
//                     }
//                 }
//             else{
//                 l = mid + 1;
//                 r = nums.length - 1;
//                 while(l <= r){
//                         mid = (l + r)/2;
//                         if(target == nums[mid]){
//                             return mid;
//                             }
//                         else if( target > nums[mid]){
//                             l  = mid + 1;
//                         }
//                         else{
//                             r = mid - 1;
//                         }
//                     }
//                 }
//             }

//         }
//     return - 1;