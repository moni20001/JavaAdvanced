import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArg = scan.nextLine().split("\\s+");
        int[] numbers = new int[strArg.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strArg[i]);
        }
        if(numbers.length %2 !=0){
            System.out.println("invalid length");
        }
        else{
            for (int i = 0; i <numbers.length ; i+=2) {
                if(numbers[i]%2 == 0 && numbers[i+1]%2 ==0){
                    System.out.println(numbers[i]+", "+numbers[i+1]+ " -> both are even");
                }
                else if(numbers[i]%2 != 0 && numbers[i+1]%2!=0){
                    System.out.println(numbers[i]+", "+numbers[i+1]+ " -> both are odd");
                }
                else{
                    System.out.println(numbers[i]+", "+numbers[i+1]+ " -> different");
                }
            }
        }

    }
}
