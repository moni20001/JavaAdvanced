import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MelhramShake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String toFind = scan.nextLine();
        while (true) {
            Pattern pat = Pattern.compile(toFind);
            int count = 0;
            Matcher matcher = pat.matcher(text);
            while (matcher.find()) {
                text.replaceFirst(matcher.group(),"");

                count++;
            }
            if (count == 0) {
                System.out.println("No shake.");
                break;
            } else {
                System.out.println("Shaked it.");
            }

        }
        System.out.println(text);
    }
}
