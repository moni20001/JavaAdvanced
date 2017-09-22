import java.util.Scanner;

public class CalcTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double area = calculateArea(a,b);
        System.out.printf("Area = %.2f",area);

    }
    public static double calculateArea(double a, double b){
        return (a*b)/2;
    }
}
