import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String cmd = scan.readLine();
        String pattern = "^([\\w-_]){3,16}$";
        StringBuilder ans = new StringBuilder();
        int counter = 0;

        while(!cmd.equals("END")){
            if(Pattern.matches(pattern,cmd)){
                counter++;
                ans.append("valid\n");
            }
            else
                ans.append("invalid\n");

            cmd = scan.readLine();
        }
        if(counter>0){
            System.out.println(ans);
        }
    }
}
