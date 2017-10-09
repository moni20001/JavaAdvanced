import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Function<String,Integer> func = numbers -> {
            return  Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray().length;
        };
        Function<String,Integer> funcSum = numbers -> {
            int[] n =  Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
            int sum =0;
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum;
        };
        System.out.println("Count = "+func.apply(line));
        System.out.println("Sum = "+funcSum.apply(line));
    }
}
