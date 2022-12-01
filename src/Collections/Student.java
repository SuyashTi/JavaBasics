package Collections;
//Create a Student class with fields studId, studName, age and collegeName. Create at least 6 student objects and then ask user to enter collegeName and then display all students belong to that college
public class Student {

    private int studId;
    private String studName;
    private int age;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    private String collegeName;

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", age=" + age +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }

    public Student(int studId, String studName, int age, String collegeName) {
        this.studId = studId;
        this.studName = studName;
        this.age = age;
        this.collegeName = collegeName;
    }
}


