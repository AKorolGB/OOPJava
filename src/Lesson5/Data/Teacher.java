package Lesson5.Data;

public class Teacher extends User {
    private int id;

    public Teacher(int id,String firstName, String lastName) {
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
        return "Teacher{" +
                "id=" + id + ", firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
