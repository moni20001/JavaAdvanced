import java.util.*;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        Queue<Integer> numbers = new ArrayDeque<>();
        int[] secondLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++) {
            numbers.add(secondLine[i]);
        }

        for (int i = 0; i < s; i++) {
            numbers.remove();
        }
        if(numbers.contains(x))
            System.out.println(true);
        else
        {
            if(!numbers.isEmpty()) {

                System.out.println(Collections.min(numbers));
            }
            else{
                System.out.println(0);
            }
        }
    }
    }

