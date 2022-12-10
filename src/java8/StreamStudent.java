package java8;

import java.util.Arrays;
import java.util.List;

//Create a collection of Student object then stream through it and filter out only the 'A' grade students.
public class StreamStudent {
    public static void main(String[] args){
        Student s1 = new Student("Suyash",'A');
        Student s2 = new Student("Shailesh",'A');
        Student s3 = new Student("Rohit",'B');
        Student s4 = new Student("Mahesh",'c');

        List<Student> students = Arrays.asList(s1,s2,s3,s4);
        students.stream().filter(g ->g.getGrade()=='A').forEach(n-> System.out.println(n.getName()));

    }

}
