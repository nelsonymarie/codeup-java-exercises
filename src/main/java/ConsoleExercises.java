import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scan.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.print("Enter three words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        System.out.println("You entered: ");
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        scan.nextLine(); // to consume the remaining newline character

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();
        System.out.println("You entered: " + sentence);

        System.out.print("Enter the length of the classroom: ");
        String lengthStr = scan.nextLine();
        double length = Double.parseDouble(lengthStr);

        System.out.print("Enter the width of the classroom: ");
        String widthStr = scan.nextLine();
        double width = Double.parseDouble(widthStr);

        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        System.out.println("The area of the classroom is: " + area);
        System.out.println("The perimeter of the classroom is: " + perimeter);

        scan.close();
    }
}
