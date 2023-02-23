package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString() {
        return scanner.nextLine();
    }

    public int getInt() {
        while (true) {
            try {
                String input = getString();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                String input = getString();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public int getBinary() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input, 2);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a binary number.");
            }
        }
    }

    public int getHex() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input, 16);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a hexadecimal number.");
            }
        }
    }
}
