package za.ac.cput.chapte51.behaviouraldesignpatterns.chainofresponsibility;

/**
 * Created by student on 2015/03/09.
 */
public class Forward extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.FORWARD) {
            return "Forward ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Forward " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
