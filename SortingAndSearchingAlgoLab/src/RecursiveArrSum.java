import java.util.Scanner;

public class RecursiveArrSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbersInStr = scan.nextLine().split(" ");
        int[] numbers = new int[numbersInStr.length];
        for (int i = 0; i < numbersInStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersInStr[i]);
        }
        int ans = arrSum(numbers,0,0);
        System.out.println(ans);
    }
    public static int arrSum(int[] arr, int index ,int value){
    if(index<arr.length){
        return value + arr[index] + arrSum(arr, index+1, value);
    }
    else
        return 0;
}
}
