import java.math.BigDecimal;
import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("\\s+");
        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 0; i < text.length; i++) {
            double number = Double.parseDouble(text[i].substring(1,text[i].length()-1));
            if(Character.isUpperCase(text[i].charAt(0))){
                number /= text[i].charAt(0) -'A' +1 ;
            }
            else if (!Character.isUpperCase(text[i].charAt(0))){
                number *= text[i].charAt(0) -'a'+1;
            }
            if(Character.isUpperCase(text[i].charAt(text[i].length()-1))){
                number -= text[i].charAt(text[i].length()-1) -'A' +1 ;
            }
            else if (!Character.isUpperCase(text[i].charAt(text[i].length()-1))){
                number += text[i].charAt(text[i].length()-1) -'a'+1;
            }
            ans = ans.add(new BigDecimal(number));
        }
        System.out.printf("%.2f",ans);
    }
}
