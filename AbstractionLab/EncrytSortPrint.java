import java.util.Arrays;
import java.util.Scanner;

public class EncrytSortPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];
        char[] vowels = new char[]{'a','i','u','e','o','A','I','U','E','O'};
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            int sum = 0;
            for(int j = 0 ;j<name.length();j++){
                if("aeiouAIUEO".contains(String.valueOf(name.charAt(j)))){
                    sum += name.charAt(j) * name.length();

                }
                else{
                    sum += name.charAt(j) / name.length();

                }
            }

            numbers[i] = sum;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
