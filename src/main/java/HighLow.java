//import java.util.Scanner;
//
//public class HighLow {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int number = (int)(Math.random() * 100) + 1;
//        int guess = 0;
//        int counter = 0;
//
//        System.out.println("Welcome to the High Low Guessing Game!");
//        System.out.println("I'm thinking of a number between 1 and 100...");
//
//        while (guess != number) {
//            System.out.print("What's your guess? ");
//            guess = input.nextInt();
//
//            if (guess < 1 || guess > 100) {
//                System.out.println("Invalid input. Please enter a number between 1 and 100.");
//            } else if (guess < number) {
//                System.out.println("HIGHER");
//            } else if (guess > number) {
//                System.out.println("LOWER");
//            }
//
//            counter++;
//        }
//
//        System.out.println("GOOD GUESS! You found the number in " + counter + " tries.");
//    }
//}
