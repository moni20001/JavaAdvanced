import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long ans = calcFactorial(n);
        System.out.println(ans);
    }
    public static long calcFactorial(int n){
       if(n>=1){
           return n*calcFactorial(n-1);
       }
       else{
           return 1;
       }
    }
}
