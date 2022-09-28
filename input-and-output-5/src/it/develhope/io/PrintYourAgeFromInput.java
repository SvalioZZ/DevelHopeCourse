package it.develhope.io;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = scanner.nextInt();
    System.out.printf("Your age is %d", age);
    }

   
}
