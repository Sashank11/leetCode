package Stackz;
import java.util.*;
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;
    public MinStack() {
        stack = new Stack<Integer>();
        min_stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        val = Math.min(val, min_stack.isEmpty() ? val : min_stack.peek());
        min_stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        min_stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }


}
// Valiant effort only min fun not working as two stacks are necessary
// private int min = 0;
//     private int[] arr;
//     private int i = 0;
//     private int topIndex;
//     private int last_min;
    
//     public MinStack() {
//         arr= new int[10];
//         topIndex = -1;
//     }

//     private void doubleCapacity(){
        
//             int[] newarr = arr;
//             arr = new int[newarr.length* 2];
//             for(int i = 0; i < newarr.length; i++){
//                 arr[i] = newarr[i];
//             }
//         }

    
//     public void push(int val) {
//         if(topIndex == arr.length - 1){
//             doubleCapacity();
//         }
//         topIndex++;
//         arr[topIndex] = val;
//         last_min = min;
//         min = Math.min(min, arr[topIndex]);
//     }
    
//     public void pop() {
//         topIndex--;
//         Math.min(last_min, min);
//     }
    
//     public int top() {
//         return arr[topIndex];
//     }
    
//     public int getMin() {
//         min = Math.min(min, arr[topIndex]);
//         return min;
//     }