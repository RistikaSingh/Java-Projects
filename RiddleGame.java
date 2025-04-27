import static java.lang.Math.absExact;

import java.util.Scanner;

public class RiddleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define an array of riddles and their corresponding answers.
        String[] riddles = {
            "I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?",
            "The more you take, the more you leave behind. What am I?",
            "I'm not alive, but I can grow; I don't have lungs, but I need air; I don't have a mouth, but water kills me. What am I?",
            "The more of this there is, the less you see. What is it?",
            "What has keys but can't open locks?",
            "What comes once in a minute, twice in a moment, but never in a thousand years?",
            " How many months have 28 days?",
            " If you have a bowl with six apples and you take away four, how many do you have?",
            

        };

        String[] answers = {
            "An echo",
            "Footsteps",
            "A fire",
            " Darkness",
            "A piano",
            "The Letter M",
            " All 12 months have at least 28 days",
            " four"
        };

        // Define hints for each riddle.
        String[] hints = {
            "Hint: This thing is known for its ability to reflect sound.",
            "Hint: Think about what you leave behind when you walk.",
            "Hint: It produces heat and light.",
            "Think about something that can obscure your view.It's not a physical object, but rather a concept.",
            "Think about objects that have keys, but not the kind used for unlocking doors.Consider something that is used for a creative purpose.",
            "Think about units of time and how they relate to the answer. Consider the word moment and its possible connections to the answer.",
            "Think about the calendar and the number of days in each month.Consider the fact that all months have at least 28 days.",
            "Think about the action described in the question and what it means for the number of apples.Consider the fact that the question asks how many apples you have, not how many are left in the bowl."
            



            
        };

        int numRiddles = riddles.length;

        while (true) {
            int randomIndex = (int) (Math.random() * numRiddles);
            String selectedRiddle = riddles[randomIndex];
            String correctAnswer = answers[randomIndex];
            String hint = hints[randomIndex];

            // Display the riddle to the user.
            System.out.println("Riddle: " + selectedRiddle);

            // Get user's answer.
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                // If the answer is incorrect, offer a hint.
                System.out.println("Wrong! Would you like a hint? (yes/no)");
                String giveHint = scanner.nextLine().toLowerCase();
                if (giveHint.equals("yes")) {
                    System.out.println(hint);
                }
            }

            // Allow the user to continue or exit.
            System.out.println("Continue playing? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display final score.
        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing!");
    }
}