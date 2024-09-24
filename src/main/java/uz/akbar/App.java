package uz.akbar;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean playAgain = true;

		while (playAgain) {
			System.out.println("*** Welcome to the Number Guessing Game! 👋 ***");
			System.out.println("I'm thinking of a number between 1 1️⃣ and 100 💯.");
			System.out.println();

			int chances = 0;
			boolean validInput = false;

			while (!validInput) {
				System.out.println("Please select the difficulty level:");
				System.out.println("1. Easy (10 chances 🔟)");
				System.out.println("2. Medium (5 chances 5️⃣)");
				System.out.println("3. Hard (3 chances 3️⃣)");
				System.out.print("Enter your choice ⌨️: ");

				if (scanner.hasNextInt()) {
					int difficultyChoice = scanner.nextInt();

					switch (difficultyChoice) {
						case 1:
							chances = 10;
							break;

						case 2:
							chances = 5;
							break;

						case 3:
							chances = 3;
							break;

						default:
							System.out.println("Invalid choice! Defaulting to Medium difficulty 👾.\n");
							chances = 5;
							break;
					}

					validInput = true;
				} else {
					System.out.println("Invalid input! Please enter a number 👾.\n");
					scanner.next(); // clear the invalid input
				}
			}

			System.out.println("\nGreat! You have selected the " +
					(chances == 10 ? "Easy 🥉" : chances == 3 ? "Hard 🥇" : "Medium 🥈")
					+ " difficulty level.");
			System.out.println("You have " + chances + " chances to guess the correct number 🧙.\n");

			int numberToGuess = random.nextInt(100) + 1;
			int attempts = 0;
			boolean isGuessed = false;

			long startTime = System.currentTimeMillis();

			while (chances > 0 && !isGuessed) {
				System.out.print("Enter your guess ⌨️: ");

				if (scanner.hasNextInt()) {
					int userGuess = scanner.nextInt();
					attempts++;

					if (userGuess == numberToGuess) {
						System.out.println(
								"Congratulations! You guessed the correct number in " + attempts + " attempts 🪄.\n");
						isGuessed = true;
					} else if (userGuess < numberToGuess) {
						System.out.println("Incorrect! The number is greater than " + userGuess + " 🍏.\n");
					} else {
						System.out.println("Incorrect! The number is less than " + userGuess + " 🍎.\n");
					}

					chances--;
					if (chances > 0 && !isGuessed) {
						System.out.println("You have " + chances + " chances left ✨.");
					} else if (chances == 0 && !isGuessed) {
						System.out
								.println("You've run out of chances! The correct number was " + numberToGuess + " ☝️.");
					}

				} else {
					System.out.println("Invalid input! Please enter a number 👾.\n");
					scanner.next(); // clear the invalid input
				}

			}

			long endTime = System.currentTimeMillis();
			long timeTaken = (endTime - startTime) / 1000; // convert to seconds
			System.out.println("You took " + timeTaken + " seconds to finish the game ⏳.");

			System.out.print("Do you want to play again? ⏯ (yes/no): ");
			String response = scanner.next();
			playAgain = response.equalsIgnoreCase("yes");

			if (!playAgain)
				System.out.println("Thank you for playing! Goodbye 👋.\n");
		}

		scanner.close();
	}

}
