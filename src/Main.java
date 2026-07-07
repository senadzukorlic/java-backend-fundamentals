import HashAndEquals.Student;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Senad",1);
        Student s2 = new Student("Senad", 1);
        Student s3 = new Student("Ilma", 2);
        HashSet<Student> students = new HashSet<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);



            System.out.println(s1.equals(s2));

            System.out.println(s2.equals(s3));

    }
}
