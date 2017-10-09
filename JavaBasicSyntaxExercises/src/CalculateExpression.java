import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArgs = scanner.nextLine().split("\\s+");
        double a = Double.parseDouble(strArgs[0]);
        double b = Double.parseDouble(strArgs[1]);
        double c = Double.parseDouble(strArgs[2]);
        double f1 = Math.pow((Math.pow(a,2)+Math.pow(b,2))    /(Math.pow(a,2)-Math.pow(b,2)),((a+b+c)/Math.sqrt(c)));
        double f2 = (  Math.pow(   (Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)   ),(a-b)));
        double f3 =  Math.abs(   ((a+b+c)/3) -((f1+f2)/2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",f1,f2,f3);
    }

}
