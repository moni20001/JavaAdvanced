import java.util.Arrays;
        import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] num = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(scan.nextLine());
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if ((num[i] > 1)) {
                System.out.println("Min Difference is " + (num[ m+i-1] - num[i]) + ".");
                break;
            }
        }

    }
}
