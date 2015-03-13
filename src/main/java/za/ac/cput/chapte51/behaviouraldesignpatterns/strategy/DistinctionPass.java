package za.ac.cput.chapte51.behaviouraldesignpatterns.strategy;

/**
 * Created by student on 2015/03/10.
 */
public class DistinctionPass implements TestScore {

    @Override
    public boolean testScore(int score) {

        if(score >= 75) {
            return true;
        } else {
            return false;
        }
    }
}
