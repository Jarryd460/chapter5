package za.ac.cput.chapte51.behaviouraldesignpatterns.command;

/**
 * Created by student on 2015/03/10.
 */
public class WalkCommand implements Command {

    Walk walk;

    public WalkCommand(Walk walk) {
        this.walk = walk;
    }

    @Override
    public String command() {
        return walk.walk();
    }


}
