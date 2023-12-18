package Lesson5.Data;

public class Student extends User{
    private int id;

    public Student(int id,String firstName, String lastName) {
        super(firstName, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
