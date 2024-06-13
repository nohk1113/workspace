package class_basic.Interface.student;

public class Student {
    private  String name;
    private int korScore;
    private int mathScore;
    private int enhScore;

    public Student(String name, int korScore, int mathScore, int enhScore) {
        this.name = name;
        this.korScore = korScore;
        this.mathScore = mathScore;
        this.enhScore = enhScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorScore() {
        return korScore;
    }

    public void setKorScore(int korScore) {
        this.korScore = korScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnhScore() {
        return enhScore;
    }

    public void setEnhScore(int enhScore) {
        this.enhScore = enhScore;
    }
}
