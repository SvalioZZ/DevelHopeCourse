package it.develhope.classesandobjects;

public class Team {
    public String teamName;
    public Programmer p1 = new Programmer();
    public Programmer p2 = new Programmer();

    public String printTeamDetails(){
        return teamName + "\n" + p1.printPorgrammmerDetails() + "\n" + p2.printPorgrammmerDetails();
    }

}
