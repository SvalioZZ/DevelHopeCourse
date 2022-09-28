package it.develhope.classesandobjects;

// singleton class
public class CompetitionRules {
    private static CompetitionRules printRules = new CompetitionRules();

    public String competitionRule1 = "Do not copy and paste from StackOverflow!";
    public String competitionRule2 = "Learn every day!";
    public String competitionRule3 = "Be the best team!";

    public static CompetitionRules getInstance(){
        return printRules;
    }

}
