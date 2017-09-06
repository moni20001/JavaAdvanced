import java.util.Scanner;


public class CalculateTriangleAreaMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstNum = scan.nextDouble();
		double secondNum = scan.nextDouble();
		System.out.printf("Area = %.2f",calculateArea(firstNum, secondNum));

	}
	
	public static double calculateArea(double base, double height){
		return (base*height)/2;
	}
}
