import java.util.Scanner;

public class SquaresMatrix2x2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arg = scan.nextLine().split(" ");
        int row = Integer.parseInt(arg[0]);
        int col = Integer.parseInt(arg[1]);
        String[][] matrix = new String[row][col];
        int counter = 0;
        for (int i = 0; i < row; i++) {
            String[] temp = scan.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = temp[j];
            }
        }
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1; j++) {
                if(matrix[i][j].equals(matrix[i][j+1])&& matrix[i][j].equals(matrix[i+1][j]) && matrix[i][j].equals(matrix[i+1][j+1]))
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
