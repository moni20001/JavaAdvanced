import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MathPotato {
    public static void main(String[] args) throws IOException {
        BufferedReader scan1 = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> people = new LinkedList<>();
        String[] names = scan1.readLine().split(" ");
        int n = Integer.parseInt(scan1.readLine());
        int counter = 1;
        people.addAll(Arrays.asList(names));
        while(people.size()>1){
            for (int i = 1; i < n; i++) {
                people.add(people.poll());
            }
                if(isPrime(counter)) {
                    System.out.println("Prime "+ people.peek());
                }
                else{
                    System.out.println("Removed "+ people.poll());

                }
                counter++;

        }

        System.out.println("Last is "+people.poll());
        }
    private static Boolean isPrime(int n)
    {
        Boolean primeCheck = true;
        if (n == 0 || n == 1)
        {
            primeCheck = false;
            return primeCheck;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(n); i++)
            {
                if (n % i == 0)
                {
                    primeCheck = false;
                }
            }
            return primeCheck;
        }
    }
}


