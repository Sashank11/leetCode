package Stackz;
import java.util.*;
public class GenParen {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "",0, 0 ,n);
        return result;

    }
    public void backtrack(List<String> result, String current_string, int open, int close, int max) {
        if(current_string.length() == max * 2){  // some base case
            result.add(current_string);
        }
        if(open < max) backtrack(result, current_string + "(", open + 1, close, max);
        if(close < open) backtrack(result, current_string + ")", open, close + 1, max);

    }
}
