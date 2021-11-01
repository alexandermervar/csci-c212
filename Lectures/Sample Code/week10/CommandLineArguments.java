import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CommandLineArguments {

    public static void main(String[] args) {

        String inFile = "";
        String outFile = "";

        // If the number of provided arguments is less than 2, print a message and exit
        if (args.length < 2){
            System.out.println("usage: java CommandLineArguments inputfile outputfile");
            return;
        }
        // else if two arguments are provided
        else if(args.length == 2){

            inFile = args[0]; // the first argument is the name of the input file
            outFile = args[1]; // the second argument is the name of the output file
        }

        try {

            // create a file
            File in = new File(inFile);
            PrintWriter out = new PrintWriter(outFile);

            Scanner scan = new Scanner((in));

            // read the input file line by line
            while(scan.hasNext()){

                int no = scan.nextInt();
                // write each line to the outpot file
                System.out.println(no);
                out.println(no);

            }

            scan.close();
            out.close();

        }catch (FileNotFoundException e){
            System.out.println("Unable to locate file");
        }catch(InputMismatchException e){
            System.out.println("Integer expeected");
        }


    }
}
