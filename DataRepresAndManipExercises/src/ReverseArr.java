import java.util.Scanner;

public class ReverseArr
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
       ReverseArray(arr,arr.length);
    }

    private static void ReverseArray(String[] arr, int n) {
        if(n == 1){
            System.out.printf("%s ",arr[n-1]);

        }else {
            System.out.printf("%s ", arr[n-1]);
            ReverseArray(arr, n - 1);
        }
    }
}
