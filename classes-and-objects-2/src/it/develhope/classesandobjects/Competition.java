package it.develhope.classesandobjects;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules printRules = CompetitionRules.getInstance();
        System.out.println(printRules.competitionRule1 + "\n" +
                printRules.competitionRule2 + "\n" +
                printRules.competitionRule3);
        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "THE BEASTS";
        teamB.teamName = "THE SLAYERS";
        teamA.p1.name = "Valerio";
        teamA.p1.ageOfExperience = 2;
        teamA.p1.programmingLenguage = "Java";
        teamA.p2.name = "Daniele";
        teamA.p2.ageOfExperience = 1;
        teamA.p2.programmingLenguage = "SalesForce";
        teamB.p1.name = "Marco";
        teamB.p1.ageOfExperience = 2;
        teamB.p1.programmingLenguage = "Java";
        teamB.p2.name = "Valentina";
        teamB.p2.ageOfExperience = 1;
        teamB.p2.programmingLenguage = "Html5";

        System.out.println(teamA.printTeamDetails() + "\n----------------------------------------------" + "\n" + teamB.printTeamDetails());



    }

}
