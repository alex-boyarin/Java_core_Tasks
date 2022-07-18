package theSimplestClassesAndObjects.task3;

import java.util.Arrays;

public class Student {
    private String surname;
    private int groupNumber;
    private int[] academicProgress;

    public Student(String surname, int groupNumber, int[] academicProgress) {
        this.surname = surname;
        this.groupNumber = groupNumber;
        this.academicProgress = academicProgress;
    }


    public int[] getAcademicProgress() {
        return academicProgress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname= " + surname + '\'' +
                ", groupNumber= " + groupNumber +
                ", academicProgress= " + Arrays.toString(academicProgress) +
                "}\n";
    }
}


