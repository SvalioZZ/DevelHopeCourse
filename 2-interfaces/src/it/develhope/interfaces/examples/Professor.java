package it.develhope.interfaces.examples;

import it.develhope.interfaces.CollegePerson;
import it.develhope.interfaces.commands.ITeachingPerson;

/**
 * A Professor class is a CollegePerson and implements a TeachingPerson interface
 */
public class Professor extends CollegePerson implements ITeachingPerson {

    public String teachingSubject;

    // necessary override of the interface's abstract method
    @Override
    public void teachToOtherPeople() {
        System.out.println("Teacher has been created ..." +
                "\n" + "professor-name" + "\n" + name + "\n" + surname + "\n" +
                "College identification code: " + collegeID + "\n" +
                "Teaching subject: " +teachingSubject);
    }


    /**
     * Constructor method for Professor object
     * @param name a String for the Professor name
     * @param surname a String for the Professor surname
     * @param id an int identifier for the Professor
     * @param subject a String for the Professor subject
     */
    public Professor(String name, String surname, int id, String subject){

        this.name = name;
        this.surname = surname;
        this.collegeID = id;
        this.teachingSubject = subject;
    }
}

