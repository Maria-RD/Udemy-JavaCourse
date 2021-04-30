package co.com.mprd.domain;

public class Teacher extends Persona {
    // 1. attributes: private and static attribs
    private int teacherId;
    private char type;
    private AcademicGrading scores;
    private Student students;
    private static int teacherCounter;
    
    // 2. creating constructors
    // 2.1. default constructor
    public Teacher() {
        this.teacherId = ++Teacher.teacherCounter;
    }
    
    // 2.2. overloaded constructor (for testing purposes)
    public Teacher(char type) {
        this.type = type;
    }
    
    // 3. getters and setters
    // 3.1. teacherId
    public int getTeacherId() {
        return this.teacherId;
    }
    
    // 3.2. type
    public char getType() {
        return this.type;
    }
    
    public void setType(char type) {
        this.type = type;
    }
    
    // 3.3. scores
    public AcademicGrading getScores() {
        return this.scores;
    }
    
    public void setScores(AcademicGrading scores) {
        this.scores = scores;
    }
    
    // 3.4. students
    public Student getStudents() {
        return this.students;
    }
    
    public void setStudents(Student students) {
        this.students = students;
    }
    
    // 4. toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher: {teacherId=").append(this.teacherId);
        sb.append(", type=").append(this.type);
        sb.append(", scores=").append(this.scores);
        sb.append(", students=").append(this.students).append("}");
        sb.append(" ").append(super.toString());
        return sb.toString();
    }
}
