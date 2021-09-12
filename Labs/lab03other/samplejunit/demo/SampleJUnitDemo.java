package samplejunit.demo;
/*...

    This class contains a few static methods -- nothing
    special on their own, but we will demonstrate a way
    to test methods using JUnit, even when you would
    typically use the methods for user input. See the other
    class in this package for more on testing.

 */

import java.util.Scanner;

public class SampleJUnitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inpX = sc.nextInt();
        System.out.print("Enter another integer: ");
        int inpY = sc.nextInt();
        System.out.println("The sum of them is " + add(inpX, inpY));

        System.out.print("Enter your favorite string: ");
        sc.useDelimiter("\n");
        String inputString = sc.next();
        System.out.println("The sum of the string's characters (as ASCII values) is " + sumStringByCharValues(inputString));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int sumStringByCharValues (String str) {
        int sum = 0;
        for (int c = 0; c < str.length(); c++) {
            if (str.charAt(c) != ' ') {
                sum += str.charAt(c);
            }
        }
        return sum;
    }
}

