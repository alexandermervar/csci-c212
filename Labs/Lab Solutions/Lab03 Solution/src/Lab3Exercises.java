import java.util.*;

/**
 * Lab3Exercises implements static functions (1A, 1B, 1C, 1D) as defined in `Lab3.pdf`.
 * JUnit Tests in file Lab3ExercisesTest.java.
 */
public class Lab3Exercises {
    private static final ArrayList<String> VOWELS = new ArrayList<>(Arrays.asList("A", "E", "I", "O", "U", "a", "e", "i", "o", "u"));
    /**
     * pigLatinEncoder turns a given string into pig latin.
     * Examples: "horse" -> "orse-hay", "programmer" -> "ogrammer-pray", "Eclipse" -> "Eclipse-way"
     * @param engInput The english sentence (no numbers or punctuation) to be converted into pig latin.
     * @return The converted sentence in pig latin.
     */
    public static String pigLatinEncoder(String engInput) {
        if (engInput.strip().isEmpty()) {
            return engInput;
        }

        String[] words = engInput.split(" ");
        String encodedSentence = "";

        for (String word: words) {
            encodedSentence += pigLatinEncodeWord(word) + " ";
        }
        return encodedSentence.strip();
    }

    private static String pigLatinEncodeWord(String word) {
        String firstCharacter = String.valueOf(word.charAt(0));
        if (VOWELS.contains(firstCharacter) && !firstCharacter.equalsIgnoreCase("Y")) {
            return word + "-way";
        } else {
            String[] splitWord = word.split("(?=[AEIOUYaeiouy])", 2);
            return (splitWord.length != 2 ? splitWord[0] + "-" : splitWord[1] + "-" + splitWord[0]) + "ay";
        }
    }

    /**
     * pigLatinDecoder converts from pig latin to English.
     * Examples: We are winners" -> "e-Way are-way inners-way" -> "We (ware/are) (winners/inners)
     * @param pigInput The pig latin sentence (no numbers or punctuation) to be converted into english.
     * @return The converted sentence in pig latin.
     */
    public static String pigLatinDecoder(String pigInput) {
        if (pigInput.strip().isEmpty()) {
            return pigInput;
        }

        String[] words = pigInput.split(" ");
        String decodedSentence = "";

        for (String word: words) {
            decodedSentence += pigLatinDecodeWord(word) + " ";
        }
        return decodedSentence.strip();
    }

    private static String pigLatinDecodeWord(String word) {
        String[] halves = word.split("-");
        if (halves[1].endsWith("way")) {
            return "(" + "w" + halves[0] + "/" + halves[0] + ")";
        } else {
            return halves[1].substring(0, halves[1].length() - 2) + halves[0];
        }
    }

    /**
     * randomCarsGenerator produces a string of random cars that have driven by.
     * @param numCars The number of cars that drove by to be listed out.
     * @return String containing all random cars up to the max numCars seperated by a ",".
     */
    public static String randomCarsGenerator(int numCars) {
        String carsPassingBy = "";

        for (int i = 0; i < numCars; i++) {
            Car randomCar = CarFactory.randomCar();
            carsPassingBy += (randomCar.color + " " + randomCar.name).strip() + ", ";
        }
        return carsPassingBy;
    }

    /**
     * hextToIntNBin converts a hexadecimal input into their binary and decimal equivalents.
     * @param hexInput Hexadecimal input to convert to binary and decimal.
     * @return String that contains both binary and decimal conversions.
     */
    public static String hexToIntNBin(String hexInput) {
        hexInput = hexInput.toLowerCase().replaceAll("0x", "");
        int hexAsInt = Integer.parseInt(hexInput, 16);
        String hexAsBinary = Integer.toBinaryString(hexAsInt);
        return String.format("Your number is %d (in decimal) and %s (in binary)", hexAsInt, hexAsBinary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a sentence to be converted to pig latin, and then decoded: ");

        String input = scanner.next();
        String encodedSentence = Lab3Exercises.pigLatinEncoder(input);
        String decodedSentence = Lab3Exercises.pigLatinDecoder(encodedSentence);

        System.out.printf("English Input: %s, Encoded: %s\n", input, encodedSentence);
        System.out.printf("Encoded Input: %s, Decoded: %s\n", encodedSentence, decodedSentence);

        System.out.print("Please enter number of cars that passed by: ");
        System.out.println(Lab3Exercises.randomCarsGenerator(scanner.nextInt()));

        System.out.print("Please enter a hex to convert: ");
        System.out.println(Lab3Exercises.hexToIntNBin(scanner.next()));
    }
}

// ---Helper Classes---
/**
 * Car provides blueprint for a car, such as name, color, and type.
 * Also contains all available colors cars can be, as well as all available general and special car names.
 */
class Car {
    public static String[] colors = {"Red", "Blue", "Green", "White"};
    public static String[] generalCarNames = {"Truck", "Sedan", "Jeep", "Minivan"};
    public static String[] specialCarNames = {"Ambulance", "Firetruck"};
    enum Type{General, Special}

    String name = "";
    String color = "";
    Type type = Type.General;
}

/**
 * CarFactory produces Cars for a living.
 */
class CarFactory {
    /**
     * Generates a random Car of any Car.Type, color, and name.
     * @return Car object that has random instance variables.
     */
    public static Car randomCar() {
        Random rng = new Random();
        Car car = new Car();
        car.type = Car.Type.values()[rng.nextInt(Car.Type.values().length)];
        switch (car.type) {
            case General:
                car.color = Car.colors[rng.nextInt(Car.colors.length)];
                car.name = Car.generalCarNames[rng.nextInt(Car.generalCarNames.length)];
                break;
            case Special:
                car.color = "";
                car.name = Car.specialCarNames[rng.nextInt(Car.specialCarNames.length)];
                break;
        }
        return car;
    }
}
