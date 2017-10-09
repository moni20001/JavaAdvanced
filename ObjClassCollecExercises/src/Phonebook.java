import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String,String> map =new HashMap<>();
        while (!line.equals("search")){
            String[] arg = line.split("-");
            String name = arg[0];
            String number = arg[1];
            map.put(name,number);
          line = scan.nextLine();
        }
        line = scan.nextLine();
        while (!line.equals("stop")){
            if(map.containsKey(line)){
                System.out.printf("%s -> %s\n",line,map.get(line));
            }
            else{
                System.out.printf("Contact %s does not exist.\n",line);
            }
            line = scan.nextLine();
        }
    }
}
