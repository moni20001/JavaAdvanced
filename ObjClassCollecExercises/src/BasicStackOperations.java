import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        Stack<Integer> numbers = new Stack<>() ;
        int[] secondLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            numbers.add(secondLine[i]);
        }

        for (int i = 0; i < s; i++) {
            numbers.pop();
        }
        if(numbers.contains(x))
            System.out.println(true);
        else
        {
            if(!numbers.isEmpty()) {
                Arrays.sort(numbers.toArray());
                System.out.println(numbers.peek());
            }
            else{
                System.out.println(0);
            }
        }
    }
}
