import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Welcome to the RAD oh so fun Java programming adventure" + "\n");

		/**************************************
		 * Path 1.house
		 *******************************************/
		System.out.println(
				"You are in a creepy house. Do you decide to go \"upstairs\"" + " or to the \"kitchen\"" + "?");
		String response = s.nextLine();

		/**************************************
		 * Path 2.kitchen
		 *******************************************/
		if (response.equals("upstairs")) {
			System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\""
					+ ". There is also a \"bathroom\"" + " off the hallway. Where would you like to go?");
			response = s.nextLine();

			/*************** Path2.bathroom *****************/
			if (response.equals("bathroom")) {
				System.out.println(
						"Dead end. :( You find a reflection of a shadow behind the curtain of the shower. Do you try to peak behind the \"shower\" curtain or \"run\"?");
				response = s.nextLine();

				/********** (end 1) ************/
				if (response.equals("shower")) {
					System.out.println(
							"There is in fact a creepy looking man hiding in the shower with a knife. He looks pretty angry.");
					System.out.println(
							"You're a dumbass because you're unarmed. As you throw your fist at him for dear life, you knock him down. However, "
									+ "he gets back up and stabs you right between the eyes.");
				}
				/********** (end 2) ************/
				if (response.equals("run")) {
					System.out.println(
							"Smart move. As you make your way out, you find a room that has a giant ass \"bookshelf\".");
					System.out.println(
							"You pick a book that leads to a secret path. The path takes you down a slide that leads to a room filled with gold. Too bad there\'s no way out. "
									+ "You\'re stuck in there for eternity.");
				}
			} // end bathroom
			/*************** Path2.bedroom *****************/
			if (response.equals("bedroom")) {
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade.  In the back of the room, the closet door is ajar.  "
						+ "Would you like to open the door? (\"yes\" or \"no\")");
				response = s.nextLine();

				/********** (end 3) ************/
				if (response.equals("yes")) {
					System.out.println(
							"You find a path to a huge bathroom. It looks extravagant. There\'s a hot tub. You turn it on and get in. As you get in,"
									+ " a giant figure emerges from within the shadows. It chokes and drowns you.");
				}
				/********** (end 4) ************/
				if (response.equals("no")) {
					System.out.println(
							"You decide to lay on the bed because it looks comfy. As you drift into a light slumber, a figure emerges from under the bed"
									+ "and pulls you in from out of nowhere.");
				}
			} // end bedroom
		} // end upstairs

		/**************************************
		 * Path 2.kitchen
		 *******************************************/
		if (response.equals("kitchen")) {
			System.out.println(
					"There is a long countertop with dirty dishes everywhere. Off to one side there is, as you\'d expect, a refrigerator. You may open the "
							+ "\"refrigerator\"" + " or look in a \"cabinet\"" + ".");
			response = s.nextLine();
			/****************************
			 * Path 3.refrigerator
			 *********************************/
			if (response.equals("refrigerator")) {
				System.out.println(
						"You find some food at last. It looks quite appetizing. Do you eat some? (\"yes\" or \"no\")");
				response = s.nextLine();
				/********** (end 5) ************/
				if (response.equals("yes")) {
					System.out.println(
							"Yikes. Not a smart move. Within seconds, you feel sick to your stomach and start puking until you choke on your puke. Gross...");
				}
				/********** (end 6) ************/
				if (response.equals("no")) {
					System.out.println("You're dehydrated to death. Eventually, you collapse.");
				}
			} // end refrigerator
			/**************************** Path 3.cabinet *********************************/
			if (response.equals("cabinet")) {
				System.out.println(
						"You find a rat hidden beneath some stale crackers. Do you try and kill the rat? (\"yes\" or \"no\")");
				response = s.nextLine();

				/********** (end 7) ************/
				if (response.equals("yes")) {
					System.out.println(
							"It bites you as you try and lay down a trap. Unfortunately, it has rabies. You start foaming from the mouth and fall over to your doom.");
				}
				/********** (end 8) ************/
				if (response.equals("no")) {
					System.out.println(
							"It jumps at you and bites you in the neck. Unfortunately, it has rabies. You start foaming from the mouth and fall over to your doom.");
				}
			} // end cabinet
		} // end kitchen

		System.out.println("You died. Game over. X.X");
		System.out.println("I\'ve had enough with nested loops for one evening.");
		s.close();
	} // end main
}
