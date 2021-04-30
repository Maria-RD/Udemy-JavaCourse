package co.com.mprd.domain;

public class Student extends Persona {

    // 1. defining attribs: private and static attribs
    private int studentId;
    private AcademicGrading score;
    private Teacher teacher;
    private static int studentCounter;

    // 2. constructors
    // 2.1. default constructor
    public Student() {
        this.studentId = ++Student.studentCounter;
    }
    
    // 3. getters and setters
    // 3.1. studentId
    public int getStudentId() {
        return this.studentId;
    }
    
    // 3.2. scores
    public AcademicGrading getScores() {
        return this.score;
    }
    
    public Teacher getTeacher() {
        return this.teacher;
    }
    
    // 4. toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: {studentId=").append(this.studentId);
        sb.append(", score=").append(this.score);
        sb.append(", teacher=").append(this.teacher).append("}");
        sb.append(" ").append(super.toString());
        return sb.toString();
    }

}
