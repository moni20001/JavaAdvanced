import java.util.Scanner;

public class StudentsResults {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(scan.nextLine());


            String[] temp = scan.nextLine().split(" - ");
             System.out.println(String.format("\n%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name","JAdv","JavaOOP","AdvOOP","Average"));
            String name = temp[0];
            String[] grades = temp[1].split(", ");
            double JAdv = Double.parseDouble(grades[0]);
            double JavaOOP = Double.parseDouble(grades[1]);
            double AdvOOP = Double.parseDouble(grades[2]);
            double avg = (JAdv+JavaOOP+AdvOOP)/3;
            System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,JAdv,JavaOOP,AdvOOP,avg));

    }
}
