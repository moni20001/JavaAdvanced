import java.text.DecimalFormat;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b= scan.nextDouble();
        double c = scan.nextDouble();
        String inBinaryA = Integer.toBinaryString(a);
        String inHexA = Integer.toHexString(a).toUpperCase();
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("0.000");
        String thirdNumber = df.format(b);
        String thirdNumSpaces = new String(new char[10 - thirdNumber.length()]).replace("\0", " ");
        String hexSpaces = new String(new char[10 - inHexA.length()]).replace("\0", " ");
        String fourthNumber = df2.format(c);
        String fourthNumSpaces = new String(new char[10 - fourthNumber.length()]).replace("\0", " ");
        if(inBinaryA.length() < 11) {
            String zeroes = new String(new char[10 - inBinaryA.length()]).replace("\0", "0");
            inBinaryA = zeroes + inBinaryA;
        }
        System.out.println("|"+inHexA+hexSpaces+"|"+inBinaryA+"|"+thirdNumSpaces+thirdNumber+"|"+fourthNumber+fourthNumSpaces+"|");
    }
}
