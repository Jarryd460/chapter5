package za.ac.cput.chapte51.behaviouraldesignpatterns.command;

/**
 * Created by student on 2015/03/10.
 */
public class RunCommand implements Command {

    Run run;

    public RunCommand(Run run) {
        this.run = run;
    }

    @Override
    public String command() {
        return run.run();
    }
}
