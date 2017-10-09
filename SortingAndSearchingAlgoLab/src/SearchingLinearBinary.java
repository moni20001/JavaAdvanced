import java.util.Scanner;

public class SearchingLinearBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbersInStr = scan.nextLine().split(" ");
        int[] numbers = new int[numbersInStr.length];
        for (int i = 0; i < numbersInStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersInStr[i]);
        }
        int toFind = Integer.parseInt(scan.nextLine());
        //int ans = LinearSearch(numbers,toFind);
        int ans = BinarySearch(numbers,toFind);

        System.out.println(ans);
    }
    public static int LinearSearch(int[] arr , int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                return i;
            }
        }

        return -1;
    }

    public static int BinarySearch(int[]arr , int n){
        int lo=0;
        int arrLen = arr.length;
        while(lo<=arrLen) {
            int mid = lo+(arrLen-lo)/2;
            if(n<arr[mid]){
                arrLen= mid-1;
            }
            else if(n>arr[mid]){
                lo = mid+1;
            }
            else
                return mid;
        }

        return -1;
    }
}
