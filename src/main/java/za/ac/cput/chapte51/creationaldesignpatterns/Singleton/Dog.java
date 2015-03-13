package za.ac.cput.chapte51.creationaldesignpatterns.Singleton;

/**
 * Created by student on 2015/03/08.
 */
public class Dog {

    private static Dog dog = null;

    private Dog(){

    }

    public static Dog getInstance(){
        if(dog == null)
        {
            dog = new Dog();
        }
        return dog;
    }

    public String bark(){
        return "Barking";
    }
}
