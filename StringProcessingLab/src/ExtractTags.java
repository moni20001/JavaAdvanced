import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pattern pattern = Pattern.compile("<.*?>");
        String cmd = scan.nextLine();
        while(!cmd.equals("END")){
            Matcher matcher = pattern.matcher(cmd);
            while(matcher.find()){
                System.out.println(matcher.group(0));
            }
            cmd=scan.nextLine();
        }
    }
}
