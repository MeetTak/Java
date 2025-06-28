package _4OOP_Part1.recordProject;

public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {// this is a method
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    // When u define a toString method in ur class and use the @Override annotation, u are overriding the toString method from the Object class. This ensures that ur method provides a custom string representation of ur object.
    @Override
    public String toString() {// this is a method
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getClassList() {
        return classList;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setClassList(String classList) {
        this.classList = classList;
    }
}
