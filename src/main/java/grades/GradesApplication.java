package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        // Create some students
        Student Mushroom = new Student("Alice");
        Mushroom.addGrade(90);
        Mushroom.addGrade(85);
        Mushroom.addGrade(95);
        students.put("Alice", Mushroom);

        Student Princess = new Student("Bob");
        Princess.addGrade(80);
        Princess.addGrade(75);
        Princess.addGrade(70);
        students.put("Bob", Princess);

        Student Mario = new Student("Charlie");
        Mario.addGrade(95);
        Mario.addGrade(90);
        Mario.addGrade(100);
        students.put("Charlie", Mario);

        Student Luigi = new Student("Dave");
        Luigi.addGrade(70);
        Luigi.addGrade(60);
        Luigi.addGrade(80);
        students.put("Dave", Luigi);

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