package operations;

public class Exercise2 {
    /*
    Problem statement: Calculate and print the final score of a student in the
    Systems Design course of the software engineering program. There are two
    partial scores and an exam, the partial scores have 35% and the exam 30%.
    It is approved with a final score >=3.
    */
    
    // Best practices
    // 1. declaring the attributes
    double firstScore, secondScore, examScore, finalScore;
    String veredict;
    
    // 2.1. creating the method - Signature
    // method to calculate the final score
    public double finalScoreCalculation(double firstScore, double secondScore, double examScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.examScore = examScore;
        this.finalScore = ((this.firstScore*0.35)+(this.secondScore*0.35)+(this.examScore*0.30));
        return this.finalScore;
    }
    
    // 2.2. creating another method
    // this is to state if the student passed or failed
    public boolean passedOrFailed() {
        return this.finalScore >= 3.0;
    }
}