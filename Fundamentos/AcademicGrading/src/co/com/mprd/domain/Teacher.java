package co.com.mprd.domain;

    
public class Teacher extends Persona {
    // 1. attributes: private and static attribs
    private int teacherId;
    private char type;
<<<<<<< HEAD
    //private AcademicGrading scoreStudent;
=======
    private AcademicGrading scoreStudent;
>>>>>>> 3f8455dc2324a231a83df6533c107549adf288b2
    private Student students[];
    private int studentsCounter;
    private static int teacherCounter;
    public final static int MAX_STUDENTS = 5;
    
    // 2. creating constructors
    // 2.1. default constructor
    // this also MUST initialize the array
    public Teacher() {
        this.teacherId = ++Teacher.teacherCounter;
        this.students = new Student[Teacher.MAX_STUDENTS];
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
    
    // 3.4. students
    public Object getStudents() {
        return this.students;
    }
    
    //public void setStudents(Student students[]) {
    //    this.students = students;
    //}
    
    public void addStudents(Student students) {
        if (this.studentsCounter < Teacher.MAX_STUDENTS) {
            this.students[studentsCounter++] = students;
        } else {
            System.out.println("");
        }
    }
    
<<<<<<< HEAD
//    public void setScoreStudent(Student student, AcademicGrading scoreStudent) {
//        //this.students[1] = students;
//        this.scoreStudent = scoreStudent;
//    }
=======
    public void setScoreStudent(Student student, AcademicGrading scoreStudent) {
        //this.students[1] = students;
        this.scoreStudent = scoreStudent;
    }
>>>>>>> 3f8455dc2324a231a83df6533c107549adf288b2
    
    // 4. toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher: {teacherId=").append(this.teacherId);
        sb.append(", type=").append(this.type);
<<<<<<< HEAD
        //sb.append(", scoreStudent=").append(this.scoreStudent);
=======
        sb.append(", scoreStudent=").append(this.scoreStudent);
>>>>>>> 3f8455dc2324a231a83df6533c107549adf288b2
        sb.append(", students=");
        // An iteration is necessary to show the full array
        for (int i=0; i<this.studentsCounter; i++){
            sb.append(this.students[i]).append("\n");
        }
        sb.append("}");
        sb.append(" ").append(super.toString());
        return sb.toString();
    }
}
