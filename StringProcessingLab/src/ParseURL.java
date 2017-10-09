import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String url = scan.nextLine();
        try {
            int indexFirst = url.indexOf(":");
            String protocol = url.substring(0, indexFirst);
            int lastIndex = url.lastIndexOf("/");

            String newString = url.replace(protocol + "://", "");
            int middleIndex = newString.indexOf("/");
            int firstIndex = newString.indexOf("/");
            String server = newString.substring(0, middleIndex);
            String recourse = newString.substring(firstIndex + 1);
            System.out.println("Protocol = " + protocol);
            System.out.println("Server = " + server);
            System.out.println("Resources = " + recourse);
        }catch (Exception e ){
            System.out.println("Invalid URL");
        }
    }
}
