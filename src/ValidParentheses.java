import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

//        test cases
//        () -> true
//        ()[]{} -> true
//        (] -> true
//        ({})[] -> true
//        {] -> false
//        {()]} -> false

        boolean valid = new ValidParentheses().isValid("({})[]");
        System.out.println(valid);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        System.out.println(s.toCharArray());

        // if one of open bracket meets, it pushes into the stack
        // otherwise matching the close bracket with the open bracket of the same bracket type
        for (char c : s.toCharArray()) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
