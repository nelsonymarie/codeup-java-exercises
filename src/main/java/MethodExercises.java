//import java.util.Scanner;
//
//
//public class MethodExercises {
//    public static int add(int a, int b) {
//        return a + b;
//    }
//    public static int sub(int a, int b) {
//        return a - b;
//    }
//    public static int mul(int a, int b) {
//        return a * b;
//    }
//    public static int div(int a, int b) {
//        return a / b;
//    }
//    public static int mod(int a, int b) {
//        return a % b;
//    }
//    public static void main(String[] args) {
//    System.out.println(add(1, 2));
//    System.out.println(sub(1, 2));
//    System.out.println(mul(1, 2));
//    System.out.println(div(1, 2));
//    System.out.println(mod(1, 2));
//
//}
//}


//
//public class MethodExercises {
//    public static int add(int a, int b) {
//        return a + b;
//    }
//    public static int sub(int a, int b) {
//        return a - b;
//    }
//    public static int mul(int a, int b) {
//        // Create multiplication method without the * operator
//        int result = 0;
//        for (int i = 0; i < b; i++) {
//            result = add(result, a);
//        }
//        return result;
//    }
//    public static int div(int a, int b) {
//        return a / b;
//    }
//    public static int mod(int a, int b) {
//        return a % b;
//    }
//    public static void main(String[] args) {
//        System.out.println(add(1, 2));
//        System.out.println(sub(1, 2));
//        System.out.println(mul(1, 2));
//        System.out.println(div(1, 2));
//        System.out.println(mod(1, 2));
//
//    }
//}


// Create an application that simulates dice rolling

//import java.util.Scanner;
//
//public class DiceRoller {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number of sides for a pair of dice: ");
//        int sides = scanner.nextInt();
//
//        System.out.println("Roll the dice by pressing Enter: ");
//        scanner.nextLine();
//        scanner.nextLine();
//
//        int dice1 = rollDice(sides);
//        int dice2 = rollDice(sides);
//
//        System.out.println("Dice 1: " + dice1);
//        System.out.println("Dice 2: " + dice2);
//
//        System.out.println("Do you want to roll the dice again? (y/n)");
//        String answer = scanner.nextLine();
//        if (answer.equals("y")) {
//            main(null);
//        }
//    }
//
//    // Method that generates a random number between 1 and the number of sides
//    public static int rollDice(int sides) {
//        return (int) (Math.random() * sides) + 1;
//    }
//}
