import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String regex = "^[A-Z][a-z]+ [A-Z][a-z]+$";
        while(!text.equals("end")){
            if(Pattern.matches(regex,text)){
                System.out.println(text);
            }
            text = scan.nextLine();
        }
    }
}
