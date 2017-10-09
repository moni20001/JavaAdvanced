import java.util.*;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> palindromes = new TreeSet<>();
        String[] arr = scan.nextLine().split("[\\s,.?!]+");
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            String toCheck = new StringBuilder(temp).reverse().toString();
            if(temp.equals(toCheck)){
                palindromes.add(temp);
            }
        }
        Iterator iter = palindromes.iterator();
        StringBuilder ans = new StringBuilder();
        int count =0;
        System.out.print("[");
        while (iter.hasNext()) {
            ans.append(iter.next().toString());
            ans.append(", ");
        }
       try{ ans.replace(ans.length()-2,ans.length(),"");}
       catch (Exception e){

       }
        System.out.print(ans.toString());
        System.out.print("]");
    }
}
