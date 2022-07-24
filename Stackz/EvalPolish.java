package Stackz;
import java.util.*;
public class EvalPolish {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> eval = new Stack<>();
        for(int i = 0; i<tokens.length; i++){
                if(tokens[i].equals("/")){
                    int a = eval.pop();
                    int b = eval.pop();
                    eval.push(b / a);
                }
                else if(tokens[i].equals("+")){
                    int a = eval.pop();
                    int b = eval.pop();
                    eval.push(b + a);
                }
                else if(tokens[i].equals("-")){
                    int a = eval.pop();
                    int b = eval.pop();
                    eval.push(b - a);
                }
                else if(tokens[i].equals("*")){
                    int a = eval.pop();
                    int b = eval.pop();
                    eval.push(b * a);
                }
                else{
                eval.push(Integer.parseInt(tokens[i]));
            }
        }
        return eval.pop();
    }
    public static void main(String[] args) {
        String[] objs = {"4","13","5","/","+"};
        System.out.println(evalRPN(objs));
    }
}
