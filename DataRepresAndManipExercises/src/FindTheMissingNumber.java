import java.util.Arrays;
import java.util.Scanner;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] numbersStr = scan.nextLine().split(", ");
        int[] numbers =new int[numbersStr.length];
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }
        Arrays.sort(numbers);
        for (int i = 1; i < n; i++) {
                if (numbers[i-1] != i ) {
                     System.out.println(i);
                     break;
               }
        }
    }
}
