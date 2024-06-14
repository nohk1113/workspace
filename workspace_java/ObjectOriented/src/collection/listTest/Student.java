package collection.listTest;

public class Student {
    String name;
    int korScore;
    int enhScore;
    int total;

    public Student(String name, int korScore, int enhScore) {
        this.name = name;
        this.korScore = korScore;
        this.enhScore = enhScore;
        this.total = korScore+enhScore;
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

    public int getEnhScore() {
        return enhScore;
    }

    public void setEnhScore(int enhScore) {
        this.enhScore = enhScore;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korScore=" + korScore +
                ", enhScore=" + enhScore +
                ", total=" + total +
                '}';
    }
}
