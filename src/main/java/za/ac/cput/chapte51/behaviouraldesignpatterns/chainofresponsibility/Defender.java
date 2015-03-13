package za.ac.cput.chapte51.behaviouraldesignpatterns.chainofresponsibility;

/**
 * Created by student on 2015/03/09.
 */
public class Defender extends Team {

    @Override
    public String team(FootballPositions position) {
        String str = null;

        if(position == FootballPositions.DEFENDER) {
            return "Defender ";
        } else {
            if(team != null) {
                str = team.team(position);
            }
            return "Not Defender " + str;
        }
    }

    public String toString(String string) {
        return string;
    }
}
