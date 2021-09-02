/*
author: amervar
Date: 8.26.2021
Professor Siddiqui
 */

public class lab01 {
    public static void main(String[] args) {
        // Printing Patterns
        // Shape A: Triangle Down
        System.out.println("Shape A");
        int max = 1;
        for(int i=0; i<10; i++) {
            for(int j=0; j<max; j++) {
                System.out.print("*");
            }
            max++;
            System.out.println();
        }
        System.out.println();

        // Printing Patterns
        // Shape B: Triangle Upside Down
        System.out.println("Shape B");
        max = 10;
        for(int i=0; i<10; i++) {
            for (int j=0; j<max; j++) {
                System.out.print("*");
            }
            max--;
            System.out.println();
        }
        System.out.println();

        // Printing Patterns
        // Shape C: Triangle Upside Down and Flipped
        System.out.println("Shape C");
        max=10;
        for (int i=0; i<10; i++) {
            if (max != 10) {
                for (int s=0; s<10-max; s++) {
                    System.out.print(" ");
                }
            }
            for (int j=0; j<max; j++) {
                System.out.print("*");
            }
            System.out.println();
            max--;
        }
        System.out.println();

        // Printing Patterns
        // Shape D: Triangle Down Flipped
        System.out.println("Shape D");
        max = 1;
        for(int i=0; i<10; i++) {
            if (max != 10) {
                for (int s=0; s<10-max; s++) {
                    System.out.print(" ");
                }
            }
            for(int j=0; j<max; j++) {
                System.out.print("*");
            }
            max++;
            System.out.println();
        }
        System.out.println();
    }
}
