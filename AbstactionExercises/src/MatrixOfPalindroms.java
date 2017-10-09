import java.util.Scanner;

public class MatrixOfPalindroms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");

        int col = Integer.parseInt(numbers[0]);
        int row = Integer.parseInt(numbers[1]);
        String[][] matrix = new String[col][row];
        for (int i = 0; i < col; i++) {
            int counter = 0;
            for (int j = 0; j < row; j++) {

               matrix[i][j] = ""+(char) ('a'+ i) +( char) ('a'+ i+counter) + (char) ('a'+ i);
               counter++;
            }
            System.out.println();
        }

        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {
                System.out.printf("%s ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
