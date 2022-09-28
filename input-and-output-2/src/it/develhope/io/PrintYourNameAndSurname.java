package it.develhope.io;

import java.util.Scanner;

public class PrintYourNameAndSurname {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert name: ");
        String name = scanner.nextLine();
        System.out.println("insert sourname: ");
        String sourname = scanner.nextLine();
        System.out.printf("Hello %s %s!", name, sourname);
    }

}
