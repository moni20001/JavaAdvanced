import java.util.*;

public class ReadInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String firstWord = scanner.next("\\w+");
		String secondWord = scanner.next("\\w+");
		Integer firstInt = scanner.nextInt();
		Integer secondInt = scanner.nextInt();
		Integer thirdInt = scanner.nextInt();
		scanner.nextLine();
		String thirdWord = scanner.nextLine();
		int sum = firstInt + secondInt + thirdInt;
		
		System.out.printf("%s %s %s %d",firstWord,secondWord,thirdWord,sum);

	}

}
