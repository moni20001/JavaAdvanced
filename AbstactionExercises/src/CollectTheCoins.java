import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] matrix = new String[4][];
        for (int i = 0; i < 4; i++) {
            String temp = scan.nextLine();
            for (int j = 0; j < temp.length(); j++) {
                matrix[i][j] = Character.toString(temp.charAt(j));

            }
        }
        String commands = scan.nextLine();
        for (int i = 0; i < commands.length(); i++) {
            String com = Character.toString(commands.charAt(i));
            case
        }
    }
}
