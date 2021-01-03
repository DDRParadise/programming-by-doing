import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		int n = 0;
		int count = 0;
		Scanner s = new Scanner(System.in);

		System.out.println("Type in a message, and I'll display it several times.");
		System.out.print("Message: ");

		String message = s.nextLine();

		System.out.println("How many times?: ");
		int x = s.nextInt();

		while (count <= 100) {
			while (n < 10) {
				while (x > n) {
					System.out.println((count += 10) + ". " + message);
					n++;
				}
			}
		}
		s.close();
	}
}