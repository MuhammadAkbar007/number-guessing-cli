# Number Guessing Game

## Description
A simple command-line interface (CLI) game built with Java ☕️ (Maven 🪶) where the computer randomly selects a number between 1 1️⃣ and 100, 💯, and the user has to guess it.
The user gets a limited number of chances to guess the correct number 🧙, depending on the selected difficulty level (Easy, Medium, or Hard) 🪄.

## Features
* Randomly selects a number between 1 and 100.
* Difficulty levels:
    * `Easy`: 10 chances to guess.
    * `Medium`: 5 chances to guess.
    * `Hard`: 3 chances to guess.
* Provides feedback on whether the guess is too high or too low.
* Tracks the number of attempts and displays a congratulatory message when the number is guessed correctly.
* Option to play multiple rounds.
* Shows the time taken for each game.

## How to Play
1. The game will welcome you and prompt you to select a difficulty level.
2. You will have a limited number of chances to guess the correct number.
3. After each guess, you will receive feedback on whether your guess is too high or too low.
4. If you guess the correct number or run out of chances, the game ends.
5. Optionally, you can choose to play another round.

## Sample Output
*** Welcome to the Number Guessing Game! ***
I'm thinking of a number between `1` and `100`.

```java
Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)
Enter your choice: 2
```

Great! You have selected the Medium difficulty level.
You have 5 chances to guess the correct number.

```java
Enter your guess: 50
Incorrect! The number is less than 50.
You have 4 chances left.

Enter your guess: 25
Incorrect! The number is greater than 25.
You have 3 chances left.

Enter your guess: 35
Congratulations! You guessed the correct number in 3 attempts.
You took 10 seconds to finish the game.

Do you want to play again? (yes/no): no
```
Thank you for playing! Goodbye.

## Installation

### Prerequisites
- [x] Java (version 11 or above)
- [x] Maven

### Steps
1. Clone the repository:
```git
git clone https://github.com/MuhammadAkbar007/number-guessing-cli.git
```
2. Navigate to the project directory:
```bash
cd number-guessing-game
```
3. Build the project using Maven:
```bash
mvn clean package
```
4. Run the game:
```java
java -cp target/number-guessing-game-1.0-SNAPSHOT.jar uz.akbar.App
```
## Project structure
* `src/main/java/`: Contains the main application source code.
* `data/`: Contains task assignment file.
* `target/`: Contains the compiled output and the JAR file.

## Project idea
The idea is taken from [Roadmap](https://roadmap.sh/) projects for beginners [task](https://roadmap.sh/projects/number-guessing-game)

## Author
Created by [Akbar](https://github.com/MuhammadAkbar007).
