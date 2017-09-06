import java.util.Scanner;

public class TransportPrice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kilo = scan.nextInt();
		String dayNight = scan.next();
		if (kilo < 20) {
			if (dayNight.equals("day")) {
				System.out.printf("%.2f", (kilo * 0.79) + 0.70);
			} else {
				System.out.printf("%.2f", (kilo * 0.90) + 0.70);
			}
		} else if (kilo >= 20 && kilo < 100) {
			System.out.printf("%.2f", kilo * 0.09);
		} else if (kilo >= 100) {
			System.out.printf("%.2f", kilo * 0.06);
		}
	}

}
