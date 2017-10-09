import java.util.Scanner;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        while (text.contains("<upcase>")){
            int firstIndex = text.indexOf("<upcase>");
            int secondIndex = text.indexOf("</upcase>");
            String textToUpper = text.substring(firstIndex+8,secondIndex);
            text = text.replaceFirst(textToUpper,textToUpper.toUpperCase());
            text =text.replaceFirst("<upcase>","");
            text =text.replaceFirst("</upcase>","");
        }
        System.out.println(text);
    }
}
