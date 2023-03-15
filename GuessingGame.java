import java.util.Scanner;
import java.util.Random;

class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int tries = 5;
    int guess;

    System.out.println("");
    System.out.println("    -----   Welcome to guessing game   -----");
    System.out.println("");

    System.out.print("You will guess a number between 0 and 20.\nPlease enter your name to begin: ");

    String name = in.nextLine();
    System.out.println("");

    int randomNum = (int) (Math.random() * 21);

    System.out.println("Hello " + name.toUpperCase() + "! You have 5 guesses!\nPlease start guessing: ");

    guess = in.nextInt();

    while (tries >= 0) {
      if (guess < randomNum) {
        tries--;
        if (tries == 0) {
          System.out.println("You have no more guesses left, YOU LOST!");
          break;
        }
        System.out.print("Guess is too low, now you have " + tries + " tries left,\nGuess Higher: ");
        guess = in.nextInt();
      }
      if (guess > randomNum) {
        tries--;
        if (tries == 0) {
          System.out.println("You have no more guesses left, YOU LOST!");
          break;
        }
        System.out.print("Guess is too high, now you have " + tries + " tries left,\nGuess Lower: ");
        guess = in.nextInt();
      }
      if (guess == randomNum) {
        System.out.println("");
        System.out.println("Goodjob, you WON!");
        break;
      }
    }

  }
}