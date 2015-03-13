package za.ac.cput.chapte51.structuraldesignpatterns.adapter;

/**
 * Created by student on 2015/03/09.
 */
public interface WeightDetails {

    public abstract  int getWeightInLbs();
    public abstract void setWeightInLbs(int weightInLbs);
    public abstract int getWeightInKg();
    public abstract void setWeightInKg(int weightInKg);
}
