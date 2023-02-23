import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public int getInt() {
        int value = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter an integer: ");
            String input = scanner.nextLine();
            try {
                value = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return value;
    }

    public double getDouble() {
        double value = 0.0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter a double: ");
            String input = scanner.nextLine();
            try {
                value = Double.parseDouble(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again.");
            }
        }
        return value;
    }
}










//import java.util.Scanner;


//
//public class Input {
//    private Scanner scanner;
//
//    // Constructor
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
//
//    // Getter
//    public Scanner getScanner() {
//        return scanner;
//    }
//
//    // Methods
//    public String getString() {
//        return scanner.nextLine();
//    }
//
//    public boolean yesNo() {
//        String input = scanner.nextLine();
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//
//    public int getInt(int min, int max) {
//        while (true) {
//            int input = scanner.nextInt();
//            if (input >= min && input <= max) {
//                return input;
//            }
//            System.out.println("Input must be between " + min + " and " + max);
//        }
//    }
//
//    public int getInt() {
//        return scanner.nextInt();
//    }
//
//    public double getDouble(double min, double max) {
//        while (true) {
//            double input = scanner.nextDouble();
//            if (input >= min && input <= max) {
//                return input;
//            }
//            System.out.println("Input must be between " + min + " and " + max);
//        }
//    }
//
//    public double getDouble() {
//        return scanner.nextDouble();
//    }
//}