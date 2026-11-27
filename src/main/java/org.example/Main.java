package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangle Type Checker");
        System.out.print("Enter three positive integers: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers.");
            return;
        }
        int a = scanner.nextInt();

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers.");
            return;
        }
        int b = scanner.nextInt();

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers.");
            return;
        }
        int c = scanner.nextInt();

        Triangle.Type type = Triangle.determineType(a, b, c);

        switch (type) {
            case RIGHT_ANGLED ->
                    System.out.println("Right-angled triangle");
            case ACUTE_ANGLED ->
                    System.out.println("Acute-angled triangle");
            case OBTUSE_ANGLED ->
                    System.out.println("Obtuse-angled triangle");
            case INVALID ->
                    System.out.println("Invalid input or triangle does not exist");
        }
    }
}

