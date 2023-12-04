package Lesson4;

public class TeacherControler implements UserControler<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
       teacherService.create(firstName,secondName,lastName);
    }

    public void  sendOnConsoleTeacher() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
