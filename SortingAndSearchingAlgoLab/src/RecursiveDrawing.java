import java.util.Collections;
import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        drawRecursive(n);
    }
    public static void drawRecursive(int n){
        if(n==0){
            return;
        }
        System.out.println(String.join("", Collections.nCopies(n,"*")));
        drawRecursive(n-1);

        System.out.println(String.join("", Collections.nCopies(n,"#")));

    }
}
