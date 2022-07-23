package Stackz;
import java.util.*;
public class ValidParentheses {
    public  static boolean isValid(String s) {
        Stack<Character> bracs = new Stack<>();
        for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
            bracs.push(s.charAt(i));
        }
        else{
            if(s.charAt(i) == ')'){
                if(bracs.isEmpty()){ 
                    return false;
                }
                if(bracs.peek() == '('){
                    bracs.pop();
                }
                else{
                    return false;
                }
            }
        if(s.charAt(i) == ']'){
                if(bracs.isEmpty()){ 
                    return false;
                }
                if(bracs.peek() == '['){
                    bracs.pop();
                }
                else{
                    return false;
                }
            }
        if(s.charAt(i) == '}'){
                if(bracs.isEmpty()){ 
                    return false;
                }
                if(bracs.peek() == '{'){
                    bracs.pop();
                }
                else{
                    return false;
                }
            }
        }
    }
    return bracs.isEmpty();
    }


    public static void main(String[] args) {
        String s = "{{}";
        System.out.println(isValid(s));
    }
}
