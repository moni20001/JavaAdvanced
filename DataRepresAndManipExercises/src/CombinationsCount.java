import java.math.BigInteger;
import java.util.Scanner;

public class CombinationsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
         BigInteger ans = calcBig(n,k);
        System.out.println(ans);

    }

    public static BigInteger calcBig(long N,long K){
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N-k))
                    .divide(BigInteger.valueOf(k+1));
        }
        return ret;
    }
}
