import java.math.BigInteger;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstLine = scan.nextLine().split(", ");
        int row = Integer.parseInt(firstLine[0]);
        int col = Integer.parseInt(firstLine[1]);
        int[][] arr = new int[row][col];
        long inte=0;
        for (int i = 0; i < row; i++) {
            String[] temp = scan.nextLine().split(", ");
            for(int j = 0 ; j< col  ; j++){
                arr[i][j] = Integer.parseInt(temp[j]);
                inte += arr[i][j];
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(inte);
    }
}
