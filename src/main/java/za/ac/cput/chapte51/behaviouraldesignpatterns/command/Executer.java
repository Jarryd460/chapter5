package za.ac.cput.chapte51.behaviouraldesignpatterns.command;

/**
 * Created by student on 2015/03/10.
 */
public class Executer {

    Command command;

    public Executer(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String invokeCommand() {
        return command.command();
    }
}
