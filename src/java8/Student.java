package java8;

public class Student {
    private String Name;
    private Character Grade;

    public Student(String name, Character grade) {
        Name = name;
        Grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Character getGrade() {
        return Grade;
    }

    public void setGrade(Character grade) {
        Grade = grade;
    }
}
