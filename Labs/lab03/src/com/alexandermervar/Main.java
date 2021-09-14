package com.alexandermervar;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // pigLatinEncoder
        System.out.println("Please input the String you wish to convert to Pig Latin: ");
        String userEngInput = sc.nextLine();
        System.out.println("The translated String is: " + "\""
                + Lab3Exercises.pigLatinEncoder(userEngInput) + "\"");

        //Space in Terminal
        System.out.println();

        // pigLatinDecoder
        System.out.println("Please input the Pig Latin String you wish to convert to English: ");
        String userPigInput = sc.nextLine();
        System.out.println("The translated String is: " + "\""
                + Lab3Exercises.pigLatinDecoder(userPigInput) + "\"");

        //Space in Terminal
        System.out.println();

        // randomCarsGenerator
        System.out.println("3 Random Cars: " + Lab3Exercises.randomCarsGenerator(3));
        System.out.println();
        System.out.println("5 Random Cars: " + Lab3Exercises.randomCarsGenerator(5));
        System.out.println();
        System.out.println("10 Random Cars: " + Lab3Exercises.randomCarsGenerator(10));

        //Space in Terminal
        System.out.println();

        // hexToIntNBin
        System.out.println("Hex Value 64: " + "\n" +
                Lab3Exercises.hexToIntNBin("64"));
        System.out.println("Hex Value 7DB7B: " + "\n" +
                Lab3Exercises.hexToIntNBin("7DB7B"));
        System.out.println("Hex Value 9DF73: " + "\n" +
                Lab3Exercises.hexToIntNBin("9DF73"));
        System.out.println("Hex Value 63: " + "\n" +
                Lab3Exercises.hexToIntNBin("63"));

        // Tests for Exercise 3
        // a)
        System.out.println(7.8==78);
        System.out.println(2.3+5*7.01);
        System.out.println('N'*4);
        System.out.println(9+8+"21");

        //Space in Terminal
        System.out.println();

        // b)
        double num = 9.78;
        int newNum = (int) num;
        String newStr = String.valueOf(newNum);
        System.out.println(num);
        System.out.println(newNum);
        System.out.println(newStr);
        System.out.println(num+newNum);
        System.out.println(newStr+num);

        //Space in Terminal
        System.out.println();

        // c)
        System.out.printf("%03d",7);

        //Space in Terminal
        System.out.println();
        //Space in Terminal
        System.out.println();

        // d)
        String s = "Bye ByeBye";
        s.replace('y', 'e');
        System.out.println(s);


    }
}

/*
Exercise 3:
a)
i. Boolean - false (Correct)
ii. Double - 37.35 (Correct)
iii. String - "NNNN" (Incorrect)
    - It's actually an int (312)
    - I forgot that chars use their corresponding int values in match calculations
iv. String - 1721 (Correct)

b)
i. (CORRECT)
9.78 (Double)
9 (Int)
9 (String)
18.78 (Double)
99.78 (String)

ii. 0000000 (Incorrect, the code creates an error) (Changing the code and fixing it prints 007, which makes me still incorrect)

iii. Bye ByeBye (Correct, the value of the variable is never changed)

c)

(Q.) How are Strings immutable in Java? Explain in a few sentences. What alternatives do you have for manipulating Strings?

(A.) Strings cannot be changed. Instead, the reference to a String can be changed. For instance, if you had String str = "Hello World",
you could not change the actual String "Hello World". Instead, you would have to manipulate/use str, which at the moment is making a reference to the String "Hello World".
 To manipulate Strings, you must use variables to manipulate them by changing their references and using those references in your manipulations.

 */