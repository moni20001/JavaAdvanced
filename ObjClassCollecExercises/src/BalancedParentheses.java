import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        char[] arr = scan.nextLine().toCharArray();

        Boolean ans = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.add(arr[i]);
            } else {
                if (!stack.isEmpty()) {
                    char last = stack.peek();
                    if (last == '(' && arr[i] == ')') {
                        stack.pop();
                    } else if (last == '[' && arr[i] == ']') {
                        stack.pop();
                    } else if (last == '{' && arr[i] == '}') {
                        stack.pop();
                    } else {
                        ans = false;
                    }
                }
                else{
                    ans = false;
                }
            }
        }
        String answer = ans ? "YES" : "NO";
        System.out.println(answer);
    }
}
