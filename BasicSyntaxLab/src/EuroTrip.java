import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num = scan.nextDouble();
		BigDecimal numInDec = new BigDecimal(num * 1.20);
		BigDecimal numMul = new BigDecimal(4210500000000d);
		BigDecimal numToPrint = numInDec.multiply(numMul);

		System.out.printf("%.2f marks", numToPrint);
	}

}
