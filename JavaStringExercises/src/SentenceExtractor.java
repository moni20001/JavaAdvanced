import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String text = scan.nextLine();
        Pattern p = Pattern.compile(".+?[.?!]+");
        Pattern s = Pattern.compile(String.format("\\b%s+",word));
        Matcher m = p.matcher(text);
        while(m.find()){
            if(m.group().contains(word)){
                Matcher z = s.matcher(m.group());
                if(z.find()){
                    System.out.println(m.group().trim());
                }

            }
        }
    }
}
