import com.sun.org.apache.bcel.internal.classfile.StackMapEntry;
import sun.reflect.generics.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character,Integer> map =new TreeMap<Character,Integer>();
        char[] arr = scan.nextLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {

            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
              int temp = map.get(arr[i]);
              map.put(arr[i],temp+1);
            }
        }
        for(Map.Entry entry : map.entrySet()){
            System.out.printf("%s: %s time/s\n",entry.getKey(),entry.getValue());

        }
    }
}
