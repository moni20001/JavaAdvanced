import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("\\s+");
        Predicate<String> isUpperCase = n -> Character.isUpperCase(n.charAt(0));
        int sum =0;
        for (int i = 0; i < text.length; i++) {
           if( isUpperCase.test(text[i])){
               sum++;
           }
        }
        System.out.println(sum);
        for (int i = 0; i < text.length; i++) {
            if( isUpperCase.test(text[i])){
                System.out.println(text[i].trim());
            }
        }
    }
}
