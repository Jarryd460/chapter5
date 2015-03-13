package za.ac.cput.chapte51.creationaldesignpatterns.factory;

/**
 * Created by student on 2015/03/08.
 */
public class NewSpecies {

    public Species getSpecies(String type){
        if(type.equalsIgnoreCase("Human")){
            return new Human();
        } else {
            return new Fish();
        }
    }
}
