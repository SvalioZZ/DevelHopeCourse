package it.develhope.javadoc;

/**
 * @author Valerio Corallini
 * In this class we are going to return some variables
 * such as Strings and Concatenation of strings.
 * The class itself is a box where you can find
 * a simple 'hello' program.
 */

public class WordGames {

    /**
     * this method calls a parameter 'word' as a string
     * that has a fixed value : 'programmer', but you can use as
     * many variable's names as you want.
     * @param word value of string 'word'
     * @return a concatenation of the string 'Hello' with
     * the string with parameter 'word'
     */
    public String addHelloWord(String word){
        return "Hello " + word;
    }

    /**
     * this method displays the name and the surname of the Author
     * @param name is the name of the author
     * @param surname is the surname of the author
     * @return the concatenation of string 'name' and string 'surname'
     */
    public String getFullName(String name, String surname){
        return name + "\n" + surname;
    }
}
