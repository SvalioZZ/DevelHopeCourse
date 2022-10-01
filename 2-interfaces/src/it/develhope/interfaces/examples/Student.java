package it.develhope.interfaces.examples;

import it.develhope.interfaces.CollegePerson;
import it.develhope.interfaces.commands.ILearningPerson;

/**
 * A Professor class is a CollegePerson and implements a LearningPerson interface
 */
public class Student extends CollegePerson implements ILearningPerson {
    public int accademicYears;

    // necessary override of the interface's abstract method

    @Override
    public void studyAtHome() {
        System.out.println("Student has been created ..." +
                "\n" + "student-name" + "\n" + name + "\n" + surname + "\n" +
                "College identification code: " + collegeID + "\n" +
                "Accademic years: " + accademicYears);
    }

    /**
     * Constructor method for Student
     * @param name String for the Student name
     * @param surname a String for the Student surname
     * @param id an int for the Student identifier
     * @param year an int for the academic year
     */
   public Student(String name, String surname, int id, int year){
       this.name = name;
       this.surname = surname;
       this.collegeID = id;
       this.accademicYears = year;
   }



}



