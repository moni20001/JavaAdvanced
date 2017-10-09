import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String recourse = scan.nextLine();
            if (recourse.equals("stop"))
                break;

            Integer quantity = Integer.parseInt(scan.nextLine());
            if (!map.containsKey(recourse)) {
                map.put(recourse, 0);
            }
            if (map.containsKey(recourse)) {
                int val = map.get(recourse);
                map.put(recourse, val + quantity);
            }
        }
        for (Map.Entry ent :
                map.entrySet()) {
            System.out.println(ent.getKey()+" -> "+ent.getValue());
        }
    }
}
