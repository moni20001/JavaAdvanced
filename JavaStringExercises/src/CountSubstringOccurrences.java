import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String toFind = scan.nextLine().toLowerCase();
        Pattern pattern = Pattern.compile(toFind);
        Matcher matcher= pattern.matcher(text);
        int count = 0;
        while(matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
