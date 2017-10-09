import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> people = new LinkedList<>();
        String[] names = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < names.length; i++) {
            people.add(names[i]);
        }
        while(people.size()>1){
            for (int i = 1; i < n; i++) {
                people.offer(people.poll());
            }
            System.out.println("Removed "+ people.poll());
        }
        System.out.println("Last is "+people.poll());
    }
}
