import java.util.Random;
import java.util.Scanner;

public class App {

//	public static final int RANDOM_NUMBER = 5;

	public static void main(String[] args) {
		Random num = new Random();
		int numberToGuess = num.nextInt(10 - 1 + 1) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to the dumbest guessing game evurrrrr xD");
		System.out.println("Guess your number that's between 1 and 10. Kay?");
		int guess = s.nextInt();

		if (guess != numberToGuess) {
			System.out.println("You fucked it up. The correct answer is " + numberToGuess);
		} else {
			System.out.println("You did it, bro. The correct answer is " + numberToGuess);
		}
		s.close();
	}
}
