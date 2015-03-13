package za.ac.cput.chapte51.behaviouraldesignpatterns.chainofresponsibility;

/**
 * Created by student on 2015/03/09.
 */
public class Midfielder extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.MIDFIELDER) {
            return "Midfielder ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Midfielder " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
