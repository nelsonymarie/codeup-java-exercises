package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(85);
        alice.addGrade(95);
        System.out.println(alice.getName() + "'s average grade is " + alice.getGradeAverage());

        Student bob = new Student("Bob");
        bob.addGrade(80);
        bob.addGrade(75);
        bob.addGrade(70);
        System.out.println(bob.getName() + "'s average grade is " + bob.getGradeAverage());

        Student charlie = new Student("Charlie");
        charlie.addGrade(95);
        charlie.addGrade(90);
        charlie.addGrade(100);
        System.out.println(charlie.getName() + "'s average grade is " + charlie.getGradeAverage());

        Student dave = new Student("Dave");
        dave.addGrade(70);
        dave.addGrade(60);
        dave.addGrade(80);
        System.out.println(dave.getName() + "'s average grade is " + dave.getGradeAverage());
    }
}
