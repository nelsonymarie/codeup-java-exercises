package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create some students
        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(85);
        alice.addGrade(95);
        students.put("Alice", alice);

        Student bob = new Student("Bob");
        bob.addGrade(80);
        bob.addGrade(75);
        bob.addGrade(70);
        students.put("Bob", bob);

        Student charlie = new Student("Charlie");
        charlie.addGrade(95);
        charlie.addGrade(90);
        charlie.addGrade(100);
        students.put("Charlie", charlie);

        Student dave = new Student("Dave");
        dave.addGrade(70);
        dave.addGrade(60);
        dave.addGrade(80);
        students.put("Dave", dave);

        // Print the list of GitHub usernames
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println("\n");

        // Ask the user which student they would like to see more information about
        Scanner scanner = new Scanner(System.in);
        System.out.print("What student would you like to see more information on? ");
        String username = scanner.nextLine();

        // Display information about the student if the username exists
        if (students.containsKey(username)) {
            Student student = students.get(username);
            System.out.println("Name: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Grade Average: " + student.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the username '" + username + "'.");
        }
    }
}