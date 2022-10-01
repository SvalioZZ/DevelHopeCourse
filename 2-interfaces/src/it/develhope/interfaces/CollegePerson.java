package it.develhope.interfaces;

/**
 * Generic superclass that describes a person that goes daily to the college.
 */
public class CollegePerson {
    /**
     * Simple method that prints the details of the person going to the college
     */
    public String name;
    public String surname;
    public int collegeID;

    public CollegePerson(){

    }


    public void goToCollege(){
        System.out.println("---- Generality of Students ------" + "\n" + name + "\n"+
                surname + "\n" + collegeID);
    }

}

