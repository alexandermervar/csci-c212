////////////////////////////////////////////////////////////////////////////////////
//  C212
//  Released:  1/20/21
//  Lab 2
//  @Author  Your Name and username
//  Last Edited:
//
//  Directions: See Below
//
//////////////////////////////////////////////////////////////////////////////////

class Lab2CompoundExercises {

	// 1. Review the following method (differentOperators):
	// 1a. Change it to use ONLY compound assignment operators. All printf statements should print same values.
	// 1b. Repeat with either pre- or post- increment/decrement statements ONLY as appropriate.
     public static void differentOperators(){

          int result = -5; // result is -5
          System.out.println(result);

          --result; // result is now -6
          System.out.println(result);

          result = result / -2; // result is now 3
          System.out.println(result);

          result = result * -1; // result is now -3
          System.out.println(result);

          result = result % 3; // result is now 0
          System.out.println(result);

          result++; // result is now 1
          System.out.println(result);
     }

// 2. In the following program, explain why the value "10" is printed thrice in a row:
     public static void question2() {
        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(--i);  // "11"
        System.out.println(--i);  // "10"
        System.out.println(i--);  // "10"
        System.out.println(++i);  // "10"
     }
}