import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] argsStr = scan.nextLine().split("\\s+");
        double a = Double.parseDouble(argsStr[0]);
        double b = Double.parseDouble(argsStr[1]);
        double c= a*b;
        System.out.printf("%.2f",c);
    }
}
