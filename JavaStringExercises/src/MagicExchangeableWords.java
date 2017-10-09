import java.util.HashMap;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split("\\s+");
        HashMap<Character,Character> hashMap = new HashMap<>();
        String firstWord = words[0];
        String secondWord = words[1];
        Boolean ans = true;
        for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
            if(!hashMap.containsKey(firstWord.charAt(i))){
                hashMap.put(firstWord.charAt(i),secondWord.charAt(i));
            }
         

            if(hashMap.containsValue(secondWord.charAt(i))){
                ans = false;
            }
        }
        System.out.println(ans);
    }
}
