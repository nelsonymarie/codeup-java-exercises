//import java.util.Objects;
//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//    }
//    Here is an example implementation of the exercises in Java:

//    //Loop Basics
//// While
//    int i = 5;
//while (i <= 15) {
//        System.out.println(i);
//        i++;
//    }
//
//    // Do-While
//    int num = 0;
//do {
//        System.out.println(num);
//        num += 2;
//    } while (num <= 100);
//
//    int num = 100;
//do {
//        System.out.println(num);
//        num -= 5;
//    } while (num >= -10);
//
//    int num = 2;
//do {
//        System.out.println(num);
//        num *= num;
//    } while (num < 1000000);
//
//// For
//for (int i = 5; i <= 15; i++) {
//        System.out.println(i);
//    }
//
//for (int i = 100; i >= -10; i -= 5) {
//        System.out.println(i);
//    }
//
//for (int i = 2; i < 1000000; i *= i) {
//        System.out.println(i);
//    }
//
////FizzBuzz
//for (int i = 1; i <= 100; i++) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else {
//            System.out.println(i);
//        }
//    }
//
////    Scanner input = new Scanner(System.in);
//System.out.print("What number would you like to go up to? ");
//        int number = input.nextInt();
//
//        System.out.println("\nHere is your table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= number; i++) {
//        System.out.printf("%-7d", i);
//        System.out.print(" | ");
//        System.out.printf("%-8d", i * i);
//        System.out.print(" | ");
//        System.out.printf("%-5d%n", i * i * i);
//        }
//        System.out.println("\nWould you like to continue? (yes/no) ");
//        String response = input.next();
//        if (response.equalsIgnoreCase("yes")) {
//        System.out.println("\nLet's continue!");
//        } else {
//        System.out.println("\nDone!");
//        }
//        }
//        }
//
//    Scanner input = new Scanner(System.in);
//System.out.print("Enter a numerical grade from 0 to 100: ");
//    int grade = input.nextInt();
//if (grade >= 88) {
//        System.out.println("A");
//    } else if (grade >= 80) {
//        System.out.println("B");
//    } else if (grade >= 67) {
//        System.out.println("C");
//    } else if (grade >= 60) {
//        System.out.println("D");
//    } else {
//        System.out.println("F");
//    }


