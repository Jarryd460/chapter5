package za.ac.cput.chapte51.structuraldesignpatterns.adapter;

/**
 * Created by student on 2015/03/09.
 */
public class WeightClass extends Weight implements WeightDetails{

    @Override
    public int getWeightInLbs() {
        return toLbs(weightInKg);
    }

    @Override
    public void setWeightInLbs(int weightInLbs) {
        this.weightInKg = toKg(weightInLbs);
    }

    @Override
    public int getWeightInKg() {
        return weightInKg;
    }

    @Override
    public void setWeightInKg(int weightInKg) {
        this.weightInKg = weightInKg;
    }

    private int toKg(int weightInLbs) {
        double w = weightInLbs * 0.453;
        return (int)w;
    }

    private int toLbs(int weightInKg) {
        double w = weightInKg * 2.204;
        return (int)w;
    }
}
