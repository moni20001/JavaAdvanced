import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String row = scan.nextLine();
        List<Integer> numbers = Stream.of(row.split(", ")).map(Integer::valueOf).collect(Collectors.toList());
        numbers.removeIf(n -> n%2 !=0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) != null){
                if(i == numbers.size()-1)
                {
                    System.out.printf("%s",numbers.get(i));
                    break;
                }
                System.out.printf("%s, ",numbers.get(i));

            }
        }
        numbers.sort((a,b) -> a.compareTo(b));
        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) != null){
                if(i == numbers.size()-1)
                {
                    System.out.printf("%s",numbers.get(i));
                    break;
                }
                System.out.printf("%s, ",numbers.get(i));

            }
        }
    }
}
