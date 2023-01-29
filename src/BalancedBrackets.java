import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isValid("(1)")); // true
    }

    static boolean isValid(String s) {

        //RUN TIME: O(N)
        //SPACE COMPLEXITY: O(N)

        //create a stack to store open brackets
        Stack<Character> stack = new Stack<>();
        //create a map to map the open and close brackets
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(')', '(');
        bracket.put(']', '[');
        bracket.put('}', '{');
        bracket.put('>', '<');
        //loop through string s
        for (var ch : s.toCharArray()) {
            //if its an open bracket, add to the stack
            if (ch == '(' || ch == '[' || ch == '{' || ch == '<') {
                stack.push(ch);
            } else {
                //if its a closing bracket and the last element of the stack is the matching opening bracket
                if ((!stack.isEmpty()) && stack.peek() == bracket.get(ch)) {
                    //pop open bracket from stack
                    stack.pop();
                } else if (Character.isLetterOrDigit(ch)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        //return true if stack is empty otherwise false
        return stack.isEmpty();

    }
}
