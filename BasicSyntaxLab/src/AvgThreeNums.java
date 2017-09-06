import java.util.Scanner;


public class AvgThreeNums {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstNum = scan.nextDouble();
		double secondNum = scan.nextDouble();
		double thirdNum = scan.nextDouble();
		double avg = (firstNum+secondNum+thirdNum)/3;
		System.out.printf("%.2f",avg);
	}

}
