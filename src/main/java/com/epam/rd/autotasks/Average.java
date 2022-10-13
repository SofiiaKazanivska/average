package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int avarage_number = 0;
        int counter = 0;
        // Use Scanner methods to read input
        while ((input = scanner.nextInt()) != 0) {
           sum += input;
           counter++;
            }
            if (counter == 0) {
                System.out.println("The element was not entered.");
            }
            if (counter > 0) {
                avarage_number = sum/ counter;
                System.out.println(avarage_number);
            }

    }

}