package theSimplestClassesAndObjects.task3;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter {
    public List<Student> filterByMarks(List<Student> students) {
        List<Student> excellentStudents = new ArrayList<>();
        boolean minMark = false;
        for (Student student : students) {
            for (int mark : student.getAcademicProgress()) {
                if (mark >= 9) {
                    minMark = true;
                } else {
                    minMark = false;
                    break;
                }
            }
            if (minMark == true) {
                excellentStudents.add(student);
            }

        }
        return excellentStudents;
    }

}
