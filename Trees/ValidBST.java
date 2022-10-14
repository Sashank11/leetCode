package Trees;
import java.util.*;
public class ValidBST {
    
}
// 62 cases
// if(root == null){
//             return true;
//         }
//         if(root.left == null && root.right == null){
//             return true;
//         }
//         if(root.left == null){
//             if((root.val < root.right.val)){
//             return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         if(root.right == null){
//             if((root.val > root.left.val)){
//             return true;
//             }
//             else{
//                 return false;
//             }
//         }
//         if(!(root.val > root.left.val && root.val < root.right.val)){
//             return false;
//         }
//         return isValidBST(root.left) && isValidBST(root.right);