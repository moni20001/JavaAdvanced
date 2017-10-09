import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String guest = scan.nextLine();
        Set<String> vipGuest = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        while (!guest.equals("PARTY")){
            if(Character.isDigit(guest.charAt(0)))
                vipGuest.add(guest);
            else
                regularGuests.add(guest);

            guest=scan.nextLine();
        }
        while (!guest.equals("END")){
            if(vipGuest.contains(guest)){
                vipGuest.remove(guest);
            }
            else if(regularGuests.contains(guest)){
                regularGuests.remove(guest);
            }
            guest=scan.nextLine();
        }
        System.out.println(vipGuest.size()+regularGuests.size());
        Arrays.stream(vipGuest.toArray()).forEach(a -> System.out.println(a));
        Arrays.stream(regularGuests.toArray()).forEach(a -> System.out.println(a));
    }
}
