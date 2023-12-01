package Lesson3;

public class StudyGroup {
    private int name;
    private int numberStudents;

    public StudyGroup(int name, int numberStudents) {
        this.name = name;
        this.numberStudents = numberStudents;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void setNumberStudents(int numberStudents) {
        this.numberStudents = numberStudents;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "name='" + name + '\'' +
                ", numberStudents=" + numberStudents +
                '}';
    }
}
