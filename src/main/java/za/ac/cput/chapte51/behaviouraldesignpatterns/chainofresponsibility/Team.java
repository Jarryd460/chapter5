package za.ac.cput.chapte51.behaviouraldesignpatterns.chainofresponsibility;

/**
 * Created by student on 2015/03/09.
 */
public abstract class Team {

    Team team;

    public void setTeam(Team team) {
        this.team = team;
    }

    public abstract String team(FootballPositions position);
}
