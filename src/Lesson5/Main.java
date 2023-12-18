package Lesson5;

import Lesson5.Controller.Controller;
import Lesson5.Data.Student;
import Lesson5.Data.StudyGroup;
import Lesson5.Data.Teacher;
import Lesson5.Service.StudyGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Иван", "Иванов");
        List<Student> students = List.of(
                new Student(101, "Анна", "Смирнова"),
                new Student(102, "Петр", "Петров"),
                new Student(103, "Мария", "Иванова")
        );

        Teacher teacher1 = new Teacher(2, "Павел", "Белобокий");
        List<Student> students1 = List.of(
                new Student(111, "Алина", "Козак"),
                new Student(112, "Дмитрий", "Петров"),
                new Student(113, "Мария", "Козловская")
        );

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);


        StudyGroup studyGroup = controller.createAndAggregateStudyGroup(teacher, students);
        StudyGroup studyGroup1 = controller.createAndAggregateStudyGroup(teacher1, students1);
        // Вывод информации о созданной учебной группе
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getFullName() + ", ID: " + studyGroup.getTeacher().getId());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println(student.getFullName() + ", ID: " + student.getId());
        }
        System.out.println();
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup1.getTeacher().getFullName() + ", ID: " + studyGroup1.getTeacher().getId());
        System.out.println("Студенты:");
        for (Student student : studyGroup1.getStudents()) {
            System.out.println(student.getFullName() + ", ID: " + student.getId());
        }
    }
}
