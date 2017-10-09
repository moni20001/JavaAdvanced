import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        String line = scan.nextLine();
        for (int i = 0; i < line.toCharArray().length; i++) {
            if(line.charAt(i) == '('){
                deque.push(i);
            }
            else if(line.charAt(i)==')'){
                int startIndex = deque.pop();
                String content = line.substring(startIndex, i+1);
                System.out.println(content);
            }
        }
    }
}
