package it.develhope.constructor;

/**
 * Class that defines a teacher
 * @author Capitan Harlock
 */
public class Teacher {

    public String teacherName;
    /**
     * Constructor method for creating a new Teacher object
     */
    public Teacher(){
        System.out.println("---- Teacher is initialised ------");
    }


    /**
     * A simple method for assigning a grade to a student
     *
     * @param alum       a Student object
     * @param finalGrade an int grade that the Teacher assigns to the Student
     */
    public void assignGrade(Student alum, int finalGrade){
        alum.grade = finalGrade;
    }

}

