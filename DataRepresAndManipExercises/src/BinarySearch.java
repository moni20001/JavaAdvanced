import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbersStr = scan.nextLine().split(" ");
        int[] numb = Arrays.stream(numbersStr).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(binarySearch(numb, n, 0, numb.length));
    }

    private static int binarySearch(int[] nums, int key, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            try {
                if (key < nums[mid]) {
                    return binarySearch(nums, key, lo, mid);
                } else if (key > nums[mid]) {
                    return binarySearch(nums, key, mid + 1, hi);
                } else {
                    return mid;
                }

            } catch (Exception e) {

            }

        }
        return -1;
    }
}