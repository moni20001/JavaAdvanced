import java.util.Scanner;

public class CharMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArgs = scan.nextLine().split("\\s+");
        int ans = 0;
        for (int i = 0; i < Math.min(strArgs[0].length(), strArgs[1].length()); i++) {
            int temp = strArgs[0].charAt(i) * strArgs[1].charAt(i);
            ans += temp;
        }
        String first = strArgs[0];
        String second = strArgs[1];
       if(first.length()<second.length()){
           for (int i = first.length(); i <second.length() ; i++) {
               ans += second.charAt(i);
           }
       }
        if(first.length()>second.length()){
            for (int i = second.length(); i <first.length() ; i++) {
                ans += first.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
