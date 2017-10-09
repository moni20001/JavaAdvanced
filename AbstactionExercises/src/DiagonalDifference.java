import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] temp = scan.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }
        //
        int leftSum =0;
        int rightSum =0;
        int counter = 0;
        int counter2= n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try{
                    leftSum+= matrix[counter][j];
                    counter++;
                }
                catch (Exception e){

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try{
                    rightSum+= matrix[counter2][j];
                    counter2--;
                }
                catch (Exception e){

                }
            }
        }

        System.out.println(Math.abs(leftSum-rightSum));
    }
}
