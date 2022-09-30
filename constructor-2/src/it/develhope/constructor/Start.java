package it.develhope.constructor;

/**
 * Tester class with main method.
 *
 * @author Capitan Harlock
 */
public class Start {
    public static void main(String[] args) {
        Student stud1 = new Student("Valerio");
        Student stud2 = new Student("Alina");
        Teacher teach1 = new Teacher();
        teach1.teacherName = "Michele Mangiacotti";
        stud1.getStudentDetails();
        stud2.getStudentDetails();
        teach1.assignGrade(stud1, 4);
        teach1.assignGrade(stud2, 3);
        stud1.getStudentDetails();
        stud2.getStudentDetails();

    }
}

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    

        // create 2 students
        

        // create 1 teacher
        

        // assign a name to the teacher
        

        // assign grades to the 2 students
        

        // print the students details
        


