package util;



import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    }
}


class input {
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
                System.out.println("enter an integer.");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                String input = getString();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("enter a number.");
            }
        }
    }

    public int getBinary() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input, 2);
            } catch (NumberFormatException e) {
                System.out.println("enter a binary number.");
            }
        }
    }

    public int getHex() {
        while (true) {
            try {
                String input = getString();
                return Integer.valueOf(input, 16);
            } catch (NumberFormatException e) {
                System.out.println("enter a hexadecimal number.");
            }
        }
    }
}
