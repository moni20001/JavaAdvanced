import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String winnerName = "";
        int winnersPoints = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String  name = scan.nextLine();
            int bonus =Integer.parseInt( scan.nextLine());
            char[] nameInChar = name.toCharArray();
            int temp = 0;
            for (int j =0;j<nameInChar.length;j++){
                if(nameInChar[j]%2==0)
                    temp += nameInChar[j];
                else
                    temp -= nameInChar[j];
            }
            temp +=bonus;


            if(temp>winnersPoints){
                winnerName = name;
                winnersPoints=temp;
            }
        }
        System.out.println("The winner is "+winnerName+" - "+winnersPoints+" points");
    }
}
