package practice.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team {

    private String name;
    private int squad;
    private int year;

    public Team(String name, int squad, int year) {
        this.name = name;
        this.squad = squad;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getSquad() {
        return squad;
    }

    public int getYear() {
        return year;
    }
}

class NameComparator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        return t1.getName().compareToIgnoreCase(t2.getName());
    }
}

class SquadComparator implements Comparator<Team> {
    @Override
    public int compare(Team t1, Team t2) {
        return t1.getSquad() - t2.getSquad();
    }
}

class TeamMain{
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<Team>();
        teams.add(new Team("RCB", 25, 1996));
        teams.add(new Team("MI", 17, 1993));
        teams.add(new Team("CSK", 20, 1997));
        System.out.println("Sorting By Name:");
        Collections.sort(teams, new NameComparator());
        for (Team team : teams) {
            System.out.println(team.getName());
        }

        System.out.println("Sorting By Squad:");
        Collections.sort(teams, new SquadComparator());
        for (Team team : teams) {
            System.out.println(team.getSquad());
        }
    }
}