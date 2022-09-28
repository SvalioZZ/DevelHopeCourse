package it.develhope.io;                        // this is the name of the package, you can ignore it for now

import java.util.Scanner;

public class PrintYourName {                    // class name declaration
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s!", name);
    }


}

