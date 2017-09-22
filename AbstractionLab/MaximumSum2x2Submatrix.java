import java.util.Scanner;

public class MaximumSum2x2Submatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstLine = scan.nextLine().split(", ");
        int row = Integer.parseInt(firstLine[0]);
        int col = Integer.parseInt(firstLine[1]);
        int[][] arr = new int[row][col];
        long max=Integer.MIN_VALUE;
        int firstElem=0;
        int secondElem=0;
        int thirdElem=0;
        int fourthElem=0;

        for (int i = 0; i < row; i++) {
            String[] temp = scan.nextLine().split(", ");
            for(int j = 0 ; j< col  ; j++){
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        for (int i = 0; i < row-1; i++) {
            for(int j = 0 ; j< col-1  ; j++){
                long temp = arr[i][j]+arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1];
                if(temp>max){
                    max = temp;
                    firstElem=arr[i][j];
                    secondElem=arr[i][j+1];
                    thirdElem = arr[i+1][j];
                    fourthElem = arr[i+1][j+1];
                }
            }
        }
        System.out.println(firstElem + " "+secondElem);
        System.out.println(thirdElem + " "+fourthElem);
        System.out.println(max);
    }
}
