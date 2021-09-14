package com.alexandermervar;

public class Lab3Exercises {

    // Helper function to determine if a given char is a vowel
    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    // Examples:
    // "horse" -> "orse-hay"
    // "Rhythm" -> "ythm-Rhay"
    // "You must love using Java" -> "ou-Yay ust-may ove-lay using-way ava-Jay"
    public static String pigLatinEncoder (String engInput) {
        String[] engSplit = engInput.split(" ");
        for (int i = 0; i < engSplit.length; i++) {
            // Pull out each word from array
            // Manipulate fitting criteria
            // Replace value in array
            String word = engSplit[i];

            // Word Manipulation
            if (isVowel(word.charAt(0))) {
                engSplit[i] = word + "-way";
            }
            else {
                String move = "";
                String keep = "";
                for (int j = 0; j < word.length(); j++) {
                    if (j > 0 && (word.charAt(j) == 'y' || isVowel(word.charAt(j)))) {
                        keep = word.substring(j);
                        engSplit[i] = keep + "-" + move + "ay";
                        break;
                    }
                    move = move + word.charAt(j);
                }
            }
        }

        // Concatenate all element in the array and return them
        String returnString = "";

        for (int i = 0; i < engSplit.length; i++) {
            returnString += engSplit[i] + " ";
        }

        if (returnString.charAt(returnString.length()-1) == ' ') {
            returnString = returnString.substring(0, returnString.length()-1);
        }
        return returnString;
    }

    // Examples:
    // "orse-hay" -> "horse"
    // "ythm-Rhay" -> "Rhythm"
    // "ou-Yay ust-may ove-lay using-way ava-Jay" -> "You must love (wusing/using) Java"
   public static String pigLatinDecoder (String pigInput) {
        String[] pigSplit = pigInput.split(" ");
        for (int i = 0; i < pigSplit.length; i++) {
            // Pull each word out from the array
            // Manipulate with fitting criteria
            // Replace value in array
            String pig = pigSplit[i];

            //Word Manipulation
            //check for "-Way" ending
            if (pig.charAt(pig.length()-3) == 'W') {
                // Fix to English
                String backToFront = "";
                String frontToBack = "";
                backToFront = pig.substring(pig.length() - 3, pig.length() - 2);
                frontToBack = pig.substring(0, pig.length() - 4);
                pigSplit[i] = backToFront + frontToBack;
            }
            else if (pig.charAt(pig.length()-3) == 'w') {
                // Fix to English
                String backToFront = "";
                String frontToBack = "";
                String wordOptionOne = "";
                String wordOptionTwo = "";

                // Break up pieces (inclusive of 'w')
                backToFront = pig.substring(pig.length() - 3, pig.length() - 2);
                frontToBack = pig.substring(0, pig.length() - 4);
                wordOptionOne = backToFront + frontToBack;
                wordOptionTwo = frontToBack;

                // Replace pigSplit[i]
                pigSplit[i] = "(" + wordOptionOne + "/" + wordOptionTwo + ")";

            }
            else {
                // Fix to English
                String backToFront = "";
                String frontToBack = "";
                int dividingDash = pig.lastIndexOf("-");
                frontToBack = pig.substring(0, dividingDash);
                backToFront = pig.substring(dividingDash+1, pig.length()-2);

                pigSplit[i] = backToFront + frontToBack;
            }
        }

       // Concatenate all element in the array and return them
       String returnString = "";

       for (int i = 0; i < pigSplit.length; i++) {
           returnString += pigSplit[i] + " ";
       }

       if (returnString.charAt(returnString.length()-1) == ' ') {
           returnString = returnString.substring(0, returnString.length()-1);
       }
       return returnString;
   }





}
