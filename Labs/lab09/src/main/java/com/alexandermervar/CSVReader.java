package com.alexandermervar;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;

// A class that reads the CSV file in "resources/products.csv" and has methods for the average price of each category, 
// the most expensive product amongst the products listed, and the count of products for each category
public class CSVReader {
    
    public void averagePriceOfEachCategory() {
        String line = "";
        String csvSplitBy = ",";
        double[] averagePriceOfEachCategory = new double[4];
        int[] categoryCount = new int[4];

        for (int i = 0; i < 4; i++) {
            averagePriceOfEachCategory[i] = (double) 0;
            categoryCount[i] = 0;
        }

        try {  
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/alexandermervar/resources/products.csv"));
            br.readLine();
            while ((line = br.readLine()) != null)
            {  
                String[] product = line.split(csvSplitBy);
                if (product[1].equals("school_supplies")) {
                    categoryCount[0]++;
                    averagePriceOfEachCategory[0] += Double.parseDouble(product[2]);
                }
                else if (product[1].equals("clothing")) {
                    categoryCount[1]++;
                    averagePriceOfEachCategory[1] += Double.parseDouble(product[2]);
                }
                else if (product[1].equals("office_supplies")) {
                    categoryCount[2]++;
                    averagePriceOfEachCategory[2] += Double.parseDouble(product[2]);
                }
                else if (product[1].equals("hair_health_beauty")) {
                    categoryCount[3]++;
                    averagePriceOfEachCategory[3] += Double.parseDouble(product[2]);
                }
                else {
                    System.out.print("");
                }
            }
            br.close();
        }   
        catch (IOException e) {  
            e.printStackTrace();  
        }

        System.out.println("Average Price of School Supplies: " + averagePriceOfEachCategory[0]/categoryCount[0]);
        System.out.println("Average Price of Clothing: " + averagePriceOfEachCategory[1]/categoryCount[1]);
        System.out.println("Average Price of Office Supplies: " + averagePriceOfEachCategory[2]/categoryCount[2]);
        System.out.println("Average Price of Hair, Health, and Beauty Products: " + averagePriceOfEachCategory[3]/categoryCount[3]);
    }  

    public void mostExpensiveProduct() {
        String line = "";
        String csvSplitBy = ",";
        double mostExpensiveProduct = 0;
        try {  
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/alexandermervar/resources/products.csv"));
            br.readLine();  
            while ((line = br.readLine()) != null)
            {  
                String[] product = line.split(csvSplitBy);
                if (Double.parseDouble(product[2]) > mostExpensiveProduct) {
                    mostExpensiveProduct = Double.parseDouble(product[2]);
                }
            }

            br.close();

        }   
        catch (IOException e) {  
            e.printStackTrace();  
        }

        System.out.println("Most Expensive Product: " + mostExpensiveProduct);
    }

    public void countOfProductsForEachCategory() {
        String line = "";
        String csvSplitBy = ",";
        int[] categoryCount = new int[4];

        try {  
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/alexandermervar/resources/products.csv"));
            br.readLine();  
            while ((line = br.readLine()) != null)
            {  
                String[] product = line.split(csvSplitBy);
                if (product[1].equals("school_supplies")) {
                    categoryCount[0]++;
                }
                else if (product[1].equals("clothing")) {
                    categoryCount[1]++;
                }
                else if (product[1].equals("office_supplies")) {
                    categoryCount[2]++;
                }
                else if (product[1].equals("hair_health_beauty")) {
                    categoryCount[3]++;
                }
                else {
                    System.out.print("");
                }
            }

            br.close();

        }   
        catch (IOException e) {  
            e.printStackTrace();  
        }

        System.out.println("Count of Products for School Supplies: " + categoryCount[0]);
        System.out.println("Count of Products for Clothing: " + categoryCount[1]);
        System.out.println("Count of Products for Office Supplies: " + categoryCount[2]);
        System.out.println("Count of Products for Hair, Health, and Beauty Products: " + categoryCount[3]);
    }

    public static void main(String[] args) {
        System.out.println("");
        CSVReader csvReader = new CSVReader();
        csvReader.averagePriceOfEachCategory();
        System.out.println("");
        csvReader.mostExpensiveProduct();
        System.out.println("");
        csvReader.countOfProductsForEachCategory();
    }
}