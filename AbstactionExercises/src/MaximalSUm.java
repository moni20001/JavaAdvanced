import java.util.Scanner;

public class MaximalSUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] colsAndRows = scan.nextLine().split(" ");
        int rows = Integer.parseInt(colsAndRows[0]);
        int cols = Integer.parseInt(colsAndRows[1]);
        int[][] matrix = new int[rows][cols];
        int startIndex = 0;
        int endIndex =0;

        long max = Long.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            String[] temp = scan.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < cols-2; j++) {
                long tempSum = matrix[i][j] + matrix[i][j+1]+matrix[i][j+2]+
                        matrix[i+1][j] +matrix[i+1][j+1] +matrix[i+1][j+2]+
                        matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                if(tempSum > max){
                    max = tempSum;
                    startIndex = j;
                    endIndex = i;
                }

            }
        }
        System.out.printf("Sum = " +max+"\n");
        for (int i = endIndex; i < endIndex+3; i++) {
            for (int j = startIndex; j < startIndex+3; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
