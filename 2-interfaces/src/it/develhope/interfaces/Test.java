package it.develhope.interfaces;

import it.develhope.interfaces.commands.ILearningPerson;
import it.develhope.interfaces.commands.ITeachingPerson;
import it.develhope.interfaces.examples.Assistant;
import it.develhope.interfaces.examples.Professor;
import it.develhope.interfaces.examples.Student;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {
        // create the 3 different objects
        Student student = new Student("Valerio","Corallini", 134726, 3);

        Assistant assistant = new Assistant("Luca", "Reina", 134, true);

        Professor professor = new Professor("Michele", "Mangiacotti", 762, "Java");

        // invoke the goToCollege() method on the 3 object

        student.goToCollege();

        assistant.goToCollege();

        professor.goToCollege();


        // invoke the implemented methods from interfaces

        professor.teachToOtherPeople();

        student.studyAtHome();

        assistant.studyAtHome();
        assistant.teachToOtherPeople();

    }
}
