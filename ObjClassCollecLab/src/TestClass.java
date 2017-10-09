import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        float[] numbers = new float[input.length];
        float sum =0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Float.parseFloat(input[i]);
            sum += numbers[i];
        }

        System.out.printf("%f",sum/numbers.length);
    }
}
