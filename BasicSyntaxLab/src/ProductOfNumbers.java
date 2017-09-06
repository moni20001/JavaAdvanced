import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int last = scan.nextInt();
		BigInteger sum = BigInteger.valueOf(1);
		for (int i = first; i <= last; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		System.out.printf("product[%d..%d] = %d",first,last,sum);
	}

}
