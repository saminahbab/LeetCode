import java.util.HashMap;
import java.util.Stack;

public class validParentheses {


    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Note that an empty string is also considered valid.

    // FASTER THAN 62% OF ONLINE LEETCODE
    // USES LOWEST SPACE

     */
    public static boolean isValid(String s) {
        if(s.length() == 0) return true;
        if((s.length() == 1 )|| s.startsWith("}|]|)")){ return false;}

        HashMap<Character,Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));

        int pointer = 1;

        while(pointer < s.length()){
            if(stack.isEmpty()){stack.push(s.charAt(pointer)); pointer ++;}
            else if(map.get(s.charAt(pointer)) == stack.peek()){stack.pop();pointer ++;}
            else{stack.push(s.charAt(pointer)); pointer ++;}

        }

        return stack.isEmpty();
    }


    public static void main(String[] args){

        System.out.print(isValid("{}()[]"));
    }
}
