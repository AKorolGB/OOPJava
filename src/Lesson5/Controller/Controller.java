package Lesson5.Controller;

import Lesson5.Data.Student;
import Lesson5.Data.StudyGroup;
import Lesson5.Data.Teacher;
import Lesson5.Service.StudyGroupService;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public StudyGroup createAndAggregateStudyGroup(Teacher teacher, List<Student> students) {
        List<Integer> studentIds = getStudentIds(students);
        int teacherId = teacher.getId();


        return studyGroupService.createStudyGroup(teacher, students);
    }

    private List<Integer> getStudentIds(List<Student> students) {

        return students.stream().map(Student::getId).toList();
    }
}
