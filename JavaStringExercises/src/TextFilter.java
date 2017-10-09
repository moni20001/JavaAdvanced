import java.util.Scanner;
import java.util.regex.Pattern;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedWords = scan.nextLine().split(", ");
        String text = scan.nextLine();
        for (String word:bannedWords) {
            Pattern pat = Pattern.compile(word);
            String spaces = new String(new char[word.length()]).replace('\0', '*');
            text = text.replaceAll(word,spaces);
        }
        System.out.println(text);
    }
}
