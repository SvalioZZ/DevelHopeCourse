package it.develhope.javadoc;

/**
 * @author Valerio Corallini
 * This class contains the Main method that will run the program.
 * inside you can find some statements like the variable's names of
 * the parameters in the class 'Tester'.
 * At least it will print the whole program, and will dysplay something like this:
 *
 * Hello "word"
 * -------------------------------
 * "Name"
 * "Surname"
 */

public class Tester {
    public static void main(String[] args) {
        WordGames wordGame = new WordGames();
        String addWord = wordGame.addHelloWord("Programmer");
        String addNameSur = wordGame.getFullName("Valerio", "Corallini");
        System.out.println(addWord +
                "\n-------------------------------" +
               "\n" + addNameSur);
    }

    
}
