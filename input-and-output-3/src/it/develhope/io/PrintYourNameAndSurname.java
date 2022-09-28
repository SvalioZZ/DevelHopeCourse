package it.develhope.io;

import java.util.Scanner;

public class PrintYourNameAndSurname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert name: ");
        String name = scanner.nextLine();
        System.out.println("Insert surname: ");
        String surname = scanner.nextLine();
        System.out.printf("Hello to you %n---------- %n%s %n%s", name, surname);
    }
}
