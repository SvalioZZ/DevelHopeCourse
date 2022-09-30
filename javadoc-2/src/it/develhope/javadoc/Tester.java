package it.develhope.javadoc;

/**
 * @author Valerio Corallini
 * this class here is the program's main class, in which wee can test/run
 * the program. It prints in console the four basic operation located in
 * the class 'ArithmeticOperators'
 */

public class Tester {
    public static void main(String[] args) {

        /**
         * in this method we have created a new sentence where we
         * initialize the ArithmeticOperator 'oper', just to give
         * to owr program a clean code.
         * We will use 'oper' in the 'system.out', for calling the "ArithmeticOperators" 's
         * methods.
         */

        ArithmeticOperators oper = new ArithmeticOperators();
        System.out.printf("the sum is %d \n" +
                        "the sub is %d \n" +
                        "the mul is %d \n" +
                        "the div is %d",
                oper.sum(4, 5), oper.sub(4, 5), oper.mul(4, 5), oper.div(4, 5));

    }
}

