package BasicOps;
import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Y/N");
		char resp = s1.nextLine().charAt(0);
		if (resp == 'y') {
			System.out.println("You entered YES!");
		}
		else {
			System.out.println("You entered no");
		}
		s1.close();

	}

}
