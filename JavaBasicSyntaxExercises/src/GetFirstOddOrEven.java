import java.util.Scanner;

public class GetFirstOddOrEven {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] intArgs = scan.nextLine().split("\\s+");
        String[] cmd = scan.nextLine().split("\\s+");
        int[] numbers = new int[intArgs.length];
        for (int i = 0; i < intArgs.length; i++) {
            numbers[i] = Integer.parseInt(intArgs[i]);
        }
        int elem = Integer.parseInt(cmd[1]);

        switch (cmd[2]){
            case "odd":
                for(int i = 0 ; i<numbers.length;i++){
                    if(elem == 0){
                        break;
                    }
                    if(numbers[i]%2!=0){
                        System.out.print(numbers[i] + " ");
                        elem--;
                    }
                }
                break;
            case "even":
                for(int i = 0 ; i<numbers.length;i++){
                    if(elem == 0){
                        break;
                    }
                    if(numbers[i]%2==0){
                        System.out.print(numbers[i] + " ");
                        elem--;
                    }
                }
                break;
            default:
                throw new Exception("EXCEPTION");

        }
    }
}
