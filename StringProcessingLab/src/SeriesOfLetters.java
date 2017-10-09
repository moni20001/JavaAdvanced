import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  text = scan.nextLine();
        Pattern pat = Pattern.compile("(.)\\1*");
        Matcher m = pat.matcher(text);
        while (m.find()){
            System.out.print(m.group(1).charAt(0));
        }

    }
}
