package it.develhope.interfaces.examples;

import it.develhope.interfaces.CollegePerson;
import it.develhope.interfaces.commands.ILearningPerson;
import it.develhope.interfaces.commands.ITeachingPerson;

/**
 * The Assistant is a CollegePerson that can teach and learn
 */
public class Assistant extends CollegePerson implements
        ILearningPerson, ITeachingPerson {

    public boolean isGoingToBeAPhD;

    // mandatory abstract method override

    @Override
    public void studyAtHome() {
        System.out.println("------------------------------");
    }


    // mandatory abstract method override

    @Override
    public void teachToOtherPeople() {
        System.out.println("---- Assistant initialized ----" +
                "\n" + "assistant-name: " + "\n" + name + "\n" + surname + "\n" +
                "College identification code: " +  collegeID + "\n" +
                "Is he going to be PhD? " +isGoingToBeAPhD);
    }


    /**
     * Assistant method constructor
     * @param name a String for the Assistant name
     * @param surname a String for the Assistant surname
     * @param id an int identifier for the Assistant
     * @param willBeAPhD a boolean for the Assistant possible PhD
     */
    public Assistant (String name, String surname, int id, boolean willBeAPhD) {

        this.name = name;
        this.surname = surname;
        this.collegeID = id;
        this.isGoingToBeAPhD = willBeAPhD;
    }
}

