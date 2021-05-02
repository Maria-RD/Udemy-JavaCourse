package co.com.mprd.test;

import co.com.mprd.domain.Teacher;
import co.com.mprd.domain.Student;
import co.com.mprd.domain.AcademicGrading;

public class TestStudentTeacher {
    public static void main(String[] args) {
        // 1. setting up a test
        // setting up three new students
        // 1.1. student 1
        Student student1 = new Student();
        student1.setName("Andrew");
        student1.setFirstSurname("Smith");
        student1.setGender('m');
        System.out.println(student1);
        
        // 1.2. student 2
        Student student2 = new Student();
        student2.setName("Ana");
        student2.setFirstSurname("Smith");
        student2.setGender('f');
        System.out.println(student2);
        
        // 1.2. student 3
        Student student3 = new Student();
        student3.setName("Clarine");
        student3.setFirstSurname("Chang");
        student3.setGender('f');
        System.out.println(student3);
        
        // 2. setting up two teachers
        System.out.println();
        // 2.1. teacher 1
        Teacher teacher1 = new Teacher();
        teacher1.setName("Thomas");
        teacher1.setFirstSurname("Smith");
        teacher1.setGender('m');
        System.out.println(teacher1);
        
        // 2.1. teacher 1
        Teacher teacher2 = new Teacher();
        teacher2.setName("Ann");
        teacher2.setFirstSurname("Chew");
        teacher2.setGender('f');
        System.out.println(teacher2);
        
        // 3. assigning teachers to student
        teacher1.addStudents(student1); // Teacher Thomas: Andrew
        teacher1.addStudents(student2); // Teacher Thomas: Ana
        teacher2.addStudents(student3); // Teacher Ann: Clarine
        
        // 4. assigning student to a teacher - this shouldnt be in this way
        // student1.setTeacher(teacher1); // Student Andrew: Thomas
        
        // 4. setting scores
        teacher1.setScores(new AcademicGrading(student1, 4.0));
        
        // 4. printing again
        // 4.1. printing teachers
        System.out.println("");
        System.out.println(teacher1); // Teacher Thomas: Andrew and Ana
        System.out.println(teacher2); // Teacher Ann: Clarine
        
        // 4.2. printing students
        System.out.println("");
        System.out.println(student1); // Student Andrew: Thomas
        System.out.println(student2); // Student Ana: Thomas
        System.out.println(student3); // Student Clarine: Ann
    }
}
