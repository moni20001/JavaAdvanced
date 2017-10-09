import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Double> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            String[] gra = scan.nextLine().split(" ");
            double sum =0.0; //100/100
            //Arrays.stream zakruglq i taka ne dava 100
            // a dava 60 ->   4.351249999999999 = 4.351250
            for (int j = 0; j < gra.length; j++) {
                sum += Double.parseDouble(gra[j]);
            }
            students.put(name,sum/gra.length);
        }
        for (Map.Entry<String,Double> entry : students.entrySet()) {
            System.out.println(entry.getKey()+" is graduated with "+entry.getValue());
        }
    }
}
