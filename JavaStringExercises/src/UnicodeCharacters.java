import java.util.Scanner;

public class UnicodeCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans =scan.nextLine();
        StringBuilder c = new StringBuilder();
        for (char w : ans.toCharArray()) {
            int code = (int)w;

            c.append(String.format("\\u%04x", (int)w));
        }
        System.out.println(c);
    }
}
