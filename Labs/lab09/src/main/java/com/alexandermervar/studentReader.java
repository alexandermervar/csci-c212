package com.alexandermervar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// A class that reads resources/students.txt and has three functions:
// 1. addStudent(String name, String year) - Adds a student to the list
// 2. deleteStudent(String name) - Deletes a student from the list
// 3. countGrades() - Counts the number of studnets in each grade
// 4. getStudentCount() - Returns the number of students in the file
public class studentReader {
    
    public void addStudent(String name, String year) throws IOException {
        FileWriter fileWriter = new FileWriter("src/main/java/com/alexandermervar/resources/students.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.append("\n" + year + " " + name);
        printWriter.close();
    }

    public void deleteStudent(String name) throws IOException {
        File file = new File("src/main/java/com/alexandermervar/resources/students.txt");
        Scanner scanner = new Scanner(file);
        String line = "";
        String newLine = "";
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (!line.contains(name)) {
                newLine += line + "\n";
            }
        }
        scanner.close();
        newLine = newLine.substring(0, newLine.length() - 1);
        FileWriter fileWriter = new FileWriter("src/main/java/com/alexandermervar/resources/students.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(newLine);
        printWriter.close();
    }

    public void countGrades() throws FileNotFoundException{
        File file = new File("src/main/java/com/alexandermervar/resources/students.txt");
        Scanner scanner = new Scanner(file);
        int freshmen = 0;
        int sophomores = 0;
        int juniors = 0;
        int seniors = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.substring(0, 1).equals("F")) {
                freshmen++;
            } else if (line.substring(0, 1).equals("s")) {
                sophomores++;
            } else if (line.substring(0, 1).equals("J")) {
                juniors++;
            } else if (line.substring(0, 1).equals("S")) {
                seniors++;
            }
        }
        scanner.close();
        System.out.println("Freshmen: " + freshmen);
        System.out.println("Sophomores: " + sophomores);
        System.out.println("Juniors: " + juniors);
        System.out.println("Seniors: " + seniors);
    }

    public int getStudentCount() throws FileNotFoundException {
        File file = new File("src/main/java/com/alexandermervar/resources/students.txt");
        Scanner scanner = new Scanner(file);
        int students = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            students++;
        }
        scanner.close();
        return students;
    }

    public static void main(String[] args) throws IOException{
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        while (run) {
            System.out.println("Welcome to the Student Reader!");
            System.out.println("Please Input the menu item you would like to complete: ");
            System.out.println("1. Add a student to the file students.txt" +
            "\n2. Delete a record\n3. Count of freshmen, sophomores, juniors, and seniors" +
            "\n4. Total count of students\n5. Exit");

            int menuSelection = Integer.parseInt(sc.nextLine());

            if (menuSelection == 1) {
                System.out.println("Please enter the name of the student: ");
                String name = sc.nextLine();
                System.out.println("Please enter the year of the student: ");
                String year = sc.nextLine();
                new studentReader().addStudent(name, year);
            }
            else if (menuSelection == 2) {
                System.out.println("Please enter the name of the student: ");
                String name = sc.nextLine();
                new studentReader().deleteStudent(name);
            }
            else if (menuSelection == 3) {
                new studentReader().countGrades();
            }
            else if (menuSelection == 4) {
                System.out.println("The total number of students is: " + new studentReader().getStudentCount());
            }
            else if (menuSelection == 5) {
                run = false;
            }
            else {
                System.out.println("Invalid input. Please try again.");
                System.out.println("");
            }
        }
    }

}
