package co.com.mprd.domain;

public class Student extends Persona {

    // 1. defining attribs: private and static attribs
    private final int studentId;
    private AcademicGrading score;
    // private Teacher teacher;
    private static int studentCounter;

    // 2. constructors
    // 2.1. default constructor
    public Student() {
        this.studentId = ++Student.studentCounter;
    }

    // 2.2. overloaded constructor
    public Student(String name, String firstSurname, char gender) {
        this(); // calling the default constructor
        this.name = name;
        this.firstSurname = firstSurname;
        //this.birthDate = birthDate;
        this.gender = gender;
    }
    
    // 3. getters and setters
    // 3.1. studentId
    public int getStudentId() {
        return this.studentId;
    }

    // 3.2. scores
    public AcademicGrading getScore() {
        return this.score;
    }
    
    public void setScore(AcademicGrading score) {
        this.score = score;
    }
    
    // 3.3. teacher
    //public Teacher getTeacher() {
    //    return this.teacher;
    //}
    //public void setTeacher(Teacher teacher) {
    //    this.teacher = teacher;
    //}
        
    // 4. toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: {studentId=").append(this.studentId);
        sb.append(", score=").append(this.score);
        //sb.append(", teacher=").append(this.teacher);
        sb.append("}");
        sb.append(" ").append(super.toString());
        return sb.toString();
    }

}
