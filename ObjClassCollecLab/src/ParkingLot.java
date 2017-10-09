import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String car = scan.nextLine();
        Set<String> set = new HashSet<>();
        while (!car.equals("END")) {
            String[] carArgs = car.split(", ");
            String inOrOut =carArgs[0];
            String carNumber = carArgs[1];
            if (inOrOut.equals("IN")) {
                set.add(carNumber);
            } else {
               set.remove(carNumber) ;
            }

            car = scan.nextLine();
        }
        if (set.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carr : set) {
                System.out.println(carr);
            }
        }
    }
}
