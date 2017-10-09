import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class AddVAT {
    public static void main(String[] args) throws IOException {

        //
        //BUFFERED READER FOR 100 POINTS
        //Scanner for 80 points and 1 time limit
        //
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = Arrays.stream(scan.readLine().split(", ")).mapToDouble(Double::parseDouble).map(x -> x*1.2).toArray();
        System.out.println("Prices with VAT:");
        for (double num :
                numbers) {
            System.out.println(String.format("%1$.2f",num).replace('.',','));
        }
    }
}
