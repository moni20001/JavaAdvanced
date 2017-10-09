import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arrguments = scan.nextLine().split(", ");
        int n = Integer.parseInt(arrguments[0]);
        String model = arrguments[1];
        if(model.equals("A"))
            topBottom(n);
        else
            leftRight(n);


    }
    public static void leftRight(int n){
        int[][] matrix = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                for(int j = 0; j<n;j++){
                    matrix[j][i] = counter;
                    counter++;
                }
            }
            else{
                for(int j = n-1; j>=0;j--){
                    matrix[j][i] = counter;
                    counter++;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void topBottom(int n){
        int[][] matrix = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n;j++){
                matrix[j][i] = counter;
                counter++;
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
