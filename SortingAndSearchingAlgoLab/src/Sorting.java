import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbersInStr = scan.nextLine().split(" ");
        int[] numbers = new int[numbersInStr.length];
        for (int i = 0; i < numbersInStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersInStr[i]);
        }
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s ",numbers[i]);
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }}
