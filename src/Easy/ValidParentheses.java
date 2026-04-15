package Easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()";
        Stack<String> open = new Stack<>();
        int i=0;
        while(i<= s.length()-1){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                open.push(String.valueOf(s.charAt(i)));
            }
             else if(s.charAt(i) == ')' && !open.isEmpty() && open.peek().equals("(")){
                open.pop();
            }
            else if(s.charAt(i) == '}' && !open.isEmpty() && open.peek().equals("{")){
                open.pop();
            }
            else if(s.charAt(i) == ']' && !open.isEmpty() && open.peek().equals("[")){
                open.pop();
            }
            else{
                System.out.println(false);
                break;
            }
            i++;
        }

    }
}
