package Lesson5.Service;

import Lesson5.Data.Student;
import Lesson5.Data.StudyGroup;
import Lesson5.Data.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
