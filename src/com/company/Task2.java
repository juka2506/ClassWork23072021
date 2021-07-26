package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a string: ");
            if(!strings.add(scanner.next())) {
                System.out.println("Duplicate encountered");
            }

        }

        System.out.println(strings);
    }
}
