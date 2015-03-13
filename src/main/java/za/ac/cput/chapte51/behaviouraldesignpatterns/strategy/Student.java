package za.ac.cput.chapte51.behaviouraldesignpatterns.strategy;

/**
 * Created by student on 2015/03/10.
 */
public class Student {

    int score;
    TestScore testScore;

    public Student(int score, TestScore testScore) {
        this.score = score;
        this.testScore = testScore;
    }

    public void setTestScore(TestScore testScore) {
        this.testScore = testScore;
    }

    public int getScore() {
        return score;
    }

    public boolean result() {
        return testScore.testScore(score);
    }
}
