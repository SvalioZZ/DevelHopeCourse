package it.develhope.javadoc;

/**
 * @author Valerio Corallini
 * this class here is a math class created for the very basic operations
 * like sum, sub, mul and div.
 */

public class ArithmeticOperators {

    /**
     * this method here takes two params ,and it returns their sum
     * @param num1 first number variable
     * @param num2 second number variable
     * @return the sum of the two int variables
     */
     public int sum(int num1 , int num2){
         return num1 + num2;
     }

    /**
     * this method here takes two params, and it returns their difference
     * @param num1 first number variable
     * @param num2 second number variable
     * @return the difference between the two int variables
     */

     public int sub(int num1, int num2){
         if (num1 >= num2){
             return num1 - num2;
         }else{
             return num2 - num1;
         }
     }

    /**
     * this method here takes two params, and it returns their multiplication
     * @param num1 first number variable
     * @param num2 second number variable
     * @return the multiplication by the two int variables
     */
     public int mul(int num1, int num2){
         return num1 * num2;
     }

    /**
     * this methood here takes two params, and it returns their equals
     * @param num1 first number variable
     * @param num2 second number variable
     * @return the division between the two int variables
     */

     public int div(int num1, int num2){
         if(num1 >= num2){
             return num1 / num2;
         }else{
             return num2 / num1;
         }
     }

   
}
