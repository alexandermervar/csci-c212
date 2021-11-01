import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {

    public static void readNumbers() throws  FileNotFoundException{

        File input = new File("Text/params.txt");
        Scanner in = new Scanner(input);

        PrintWriter out = new PrintWriter("Text/output.txt");

        while(in.hasNextDouble()){
            double val = in.nextDouble();
            System.out.println(val);
            out.println(val);
        }

        in.close();
        out.close();

    }

    public static void readPopulation() throws FileNotFoundException{

        File input = new File("Text/worldpop.txt");
        Scanner in = new Scanner(input);

        PrintWriter out = new PrintWriter("Text/worldpop.csv");

        int totalPopulation = 0;

        while(in.hasNextLine()){

            String line = in.nextLine();

            int i =0;
            while(!Character.isDigit(line.charAt(i))){
                i++;
            }


            String countryName = line.substring(0, i).trim();
            int population = Integer.parseInt(line.substring(i).trim());
            totalPopulation += population;
            out.println(countryName + "\t" + population);

        }

        System.out.println("Total world population is " + totalPopulation);
        in.close();
        out.close();
    }

    public static void countWords() throws FileNotFoundException{

        File input = new File("Text/input 2.txt");
        Scanner in = new Scanner(input);

        //PrintWriter out = new PrintWriter("Text/worldpop.csv");
        int count = 0;
        while(in.hasNext()){
            System.out.println(in.next());
            count++;
        }

        in.close();
        System.out.println("The file has " + count + " words");

    }


    public  static void outputFormat(){

        String[] items = {"Cookies", "Linguine", "Clams"};
        double[] prices = {3.2, 2.95, 17.29};

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-10s %5.2f", items[i], prices[i]);
            System.out.println();
        }

    }
    public static void main(String[] args)  {

        try {
            countWords();
        }catch (FileNotFoundException e){
            System.out.println("Input File Not Found");
        }
    }
}
