import java.math.BigInteger;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[][] pascal = new long[n][n];
        long count = 1;
        for (int i = 0; i < pascal.length; i++) {
            count++;

          for(int j = 0; j<count-1;j++){
              try {
                  pascal[i][j] = pascal[i-1][j]+pascal[i-1][j-1];
              }catch (Exception e){
                  try {
                      pascal[i][j] = 1;
                  }catch (Exception b){

                  }
              }

          }
        }
        /*

        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1


         */
        for (int i = 0; i < pascal.length; i++) {

            for (int j = 0; j < pascal[i].length; j++) {
                if(pascal[i][j] !=0)
                    System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
