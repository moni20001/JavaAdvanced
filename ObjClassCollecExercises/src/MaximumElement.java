import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int[] cmd = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(cmd[0] == 1){
                stack.add(cmd[1]);
            }else if(cmd[0] == 2){
                stack.pop();
            }
            else if(cmd[0] == 3){
                System.out.println(Collections.max(stack));
            }
        }
    }
}
