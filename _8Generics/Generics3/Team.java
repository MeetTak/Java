package _8Generics.Generics3;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) { // we defining a record named Affiliation, a record in java is a kind of class that is used to model immutable data.

    @Override
    public String toString() {
        return name + " (" + type + " in " + countryCode + ")";
    }
}

public class Team<T extends Player, S> { // this line declares two parameters where can only be a class that extends P, S is an unconstrained parameter; meaning it can of any type.

    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;
    private S affiliation;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) { // here the second parameter is of generic type S representing the affiliatio to the team.
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamMember(T t) { // in this method addTeamMember, T is used as the type of the parameter t. This means that t must be an instance of a class that extends Player.
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {

        System.out.print(teamName + " Roster:");
        System.out.println((affiliation == null ? "" : " AFFILIATION: "+ affiliation));
        for (T t : teamMembers) {
            System.out.println(t.name());
        }
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        } else {
            totalLosses++;
        }

        return message;

    }

    @Override
    public String toString() {
        return teamName + " (Ranked "  + ranking() + ")";
    }
}