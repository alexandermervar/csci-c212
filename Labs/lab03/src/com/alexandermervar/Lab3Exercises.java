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
    //
   public static String pigLatinDecoder (String pigInput) {

   }





}
