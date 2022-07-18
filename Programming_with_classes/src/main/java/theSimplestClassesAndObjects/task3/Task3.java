package theSimplestClassesAndObjects.task3;

import java.util.Arrays;
import java.util.Scanner;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.
public class Task3 {
    public static void main(String[] args) {
        Student[] student = new Student[10];
        StudentFilter studentFilter = new StudentFilter();
        String name;
        int group;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < student.length; i++) {
            int[] mark = new int[5];
            System.out.print("Введите Фамилию студента: ");
            name = scanner.next();
            System.out.print("Группа: ");
            group = scanner.nextInt();
            System.out.print("Оценки: ");
            for (int j = 0; j < mark.length; j++) {
                mark[j] = scanner.nextInt();
            }
            student[i] = new Student(name, group, mark);
        }
        System.out.println(studentFilter.filterByMarks(Arrays.asList(student)));
    }
}

