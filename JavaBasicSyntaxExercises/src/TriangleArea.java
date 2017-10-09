import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        scan.nextLine();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.nextLine();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        scan.nextLine();


        int first = x1*(y2-y3);
        int second = x2*(y3-y1);
        int third = x3*(y1-y2);

        int area = Math.abs((first+second+third)/2);
        System.out.println(area);
    }
}
