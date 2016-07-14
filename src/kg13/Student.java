package kg13;

/**
 * Created by Kota Nonaka on 2016/07/14.
 */
public class Student {
    private String id;
    private int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId(){
        return this.id;
    }

    public int getScore() {
        return this.score;
    }

    public char getGrade() {
        if (score >= 80) {
            return 'A';
        }else if (score >= 70) {
            return 'B';
        }else if (score >= 60) {
            return 'C';
        }else{
            return 'D';
        }
    }

    public void add(int n) {
        this.score += n;
    }
}
