package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student Mushroom = new Student("Mushroom");
        Mushroom.addGrade(90);
        Mushroom.addGrade(85);
        Mushroom.addGrade(95);
        System.out.println(Mushroom.getName() + "'s average grade is " + Mushroom.getGradeAverage());

        Student Princess = new Student("Princess");
        Princess.addGrade(80);
        Princess.addGrade(75);
        Princess.addGrade(70);
        System.out.println(Princess.getName() + "'s average grade is " + Princess.getGradeAverage());

        Student Mario = new Student("Mario");
        Mario.addGrade(95);
        Mario.addGrade(90);
        Mario.addGrade(100);
        System.out.println(Mario.getName() + "'s average grade is " + Mario.getGradeAverage());

        Student Luigi = new Student("Luigi");
        Luigi.addGrade(70);
        Luigi.addGrade(60);
        Luigi.addGrade(80);
        System.out.println(Luigi.getName() + "'s average grade is " + Luigi.getGradeAverage());
    }
}
