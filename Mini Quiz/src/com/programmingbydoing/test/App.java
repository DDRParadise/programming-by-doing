package com.programmingbydoing.test;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String response = "";
//		int numCorrect = 0;
//		String answer = "";

		String q1 = "What is the capital of Alaska? " + "\n" + "1) Melbourne" + "\n" + "2) Anchorage" + "\n"
				+ "3) Juneau";

		String q2 = "Can you store the value of 'Cat' as a variable of type int?" + "\n" + "1) yes" + "\n" + "2) no";

		String q3 = "What is the result of 9+6/3?" + "\n" + "11" + "\n" + "5" + "\n" + "15/3";

//		ArrayList<String> a1 = new ArrayList<String>();
//
//		a1.add("1) Melbourne");
//		a1.add("2) Anchorage");
//		a1.add("3) Juneau");

//		ArrayList<String> a2 = new ArrayList<String>();
//
//		a2.add("1) Yes");
//		a2.add("2) No");

//		ArrayList<String> a3 = new ArrayList<String>();
//
//		a3.add("1) 11");
//		a3.add("2) 5");
//		a3.add("3) 15/3");

		Question[] questions = { new Question(q1, "2"), new Question(q2, "2"), new Question(q3, "1") };

		takeTest(questions);

//		
//		
//		
//		System.out.println("Are you ready for this quiz?");
//		response = s.nextLine();
//
//		if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
//			System.out.println("Okay. Here it comes.");
////			s.nextLine();
//			System.out.println("Question 1: " + q1);
//			answer = s.nextLine();
//			for (String answers : a1) {
//				System.out.println(answers);
////				answer = s.nextLine();
//
//				if (answer == "2") {
//					System.out.println("Correct");
//					numCorrect++;
//				} else {
//					System.out.println("That's incorrect. The correct answer is " + a1.get(1));
//				}
//			}
//
//			
//
////			s.nextLine();
//
////			System.out.println("Question 2: " + q2);
////			for (String answers : a2) {
////				System.out.println(answers);
////			}
////			answer = s.nextLine();
////			if (answer == "2" || answer.equalsIgnoreCase("No")) {
////				System.out.println("Correct");
////				numCorrect++;
////			} else {
////				System.out.println("That's incorrect. The correct answer is " + a2.get(1));
////			}
//////			s.nextLine();
////
////			System.out.println("Question 3: " + q3);
////			for (String answers : a3) {
////				System.out.println(answers);
////			}
////			answer = s.nextLine();
////			if (answer == "1" || answer == "11") {
////				System.out.println("Correct");
////				numCorrect++;
////			} else {
////				System.out.println("That's incorrect. The correct answer is " + a3.get(0));
////			}
//
//		} else {
//			System.out.println("I guess you're not ready.");
//		}
//		System.out.println("Thanks for playing. Your total score is: " + numCorrect + " out of 3.");
//		s.close();
	}

	public static void takeTest(Question[] questions) {
		int score = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Are you ready for this quiz?");
		String response = s.nextLine();

		if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
			System.out.println("Okay. Here it comes.");

			for (int i = 0; i < questions.length; i++) {
				System.out.println(questions[i].prompt);
				String answer = s.nextLine();

				if (answer.equals(questions[i].answer)) {
					score++;
					System.out.println("Correct");
				} else {
					System.out.println("Incorrect. The correct answer is " + questions[i].answer);
				}
			}
			System.out.println("Thanks for playing. Your total score is: " + score + " out of 3.");
		} else {
			System.out.println("I guess you're not ready.");
		}
	}
}
