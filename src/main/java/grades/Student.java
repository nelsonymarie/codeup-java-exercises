package grades;


import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public String getGrades() {
        return grades.toString();
    }
}
