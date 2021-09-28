package com.alexandermervar;

import java.util.ArrayList;
import java.util.Scanner;

public class LargeTriangles {

    public static ArrayList<MyTriangle> findTriangle(ArrayList<MyTriangle> triangleList, double thresholdArea) {

        ArrayList<MyTriangle> returnTriangles = new ArrayList<MyTriangle>();

        for(int i = 0; i < triangleList.size(); i++) {
            if (triangleList.get(i).getArea() > thresholdArea) {
                returnTriangles.add(triangleList.get(i));
            }
        }

        return returnTriangles;
    }

    public static void main(String[] args) {
        // Exercise 2: Find Larger Triangles

        MyTriangle triangleObj = new MyTriangle(3, 5);

        ArrayList<MyTriangle> definedTriangles = new ArrayList<MyTriangle>();
        definedTriangles.add(new MyTriangle(6,5));
        definedTriangles.add(new MyTriangle(7,3));
        definedTriangles.add(new MyTriangle(6,6));
        definedTriangles.add(new MyTriangle(1,1));
        definedTriangles.add(new MyTriangle(2,5));
        definedTriangles.add(new MyTriangle(8,5));
        definedTriangles.add(new MyTriangle(9,5));
        definedTriangles.add(new MyTriangle(6,9));
        definedTriangles.add(new MyTriangle(6,8));
        definedTriangles.add(new MyTriangle(6,7));

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Input the Minimum Area that a Triangle Must Be: ");
        int userTriangleArea = Integer.parseInt(sc.nextLine());

        ArrayList<MyTriangle> bigEnough = findTriangle(definedTriangles, userTriangleArea);

        for (int i = 0; i < bigEnough.size(); i++) {
            System.out.println("R" + (i+1) + " - " + bigEnough.get(i).toString());
        }

        // Test 1
        System.out.println();
        System.out.println("Test 1: ");
        bigEnough = findTriangle(definedTriangles, 15.0);

        for (int i = 0; i < bigEnough.size(); i++) {
            System.out.println("R" + (i+1) + " - " + bigEnough.get(i).toString());
        }

        // Test 2
        System.out.println();
        System.out.println("Test 2: ");
        bigEnough = findTriangle(definedTriangles, 7.0);

        for (int i = 0; i < bigEnough.size(); i++) {
            System.out.println("R" + (i+1) + " - " + bigEnough.get(i).toString());
        }

        // Test 3
        System.out.println();
        System.out.println("Test 3: ");
        bigEnough = findTriangle(definedTriangles, 0.0);

        for (int i = 0; i < bigEnough.size(); i++) {
            System.out.println("R" + (i+1) + " - " + bigEnough.get(i).toString());
        }

        // ALL TESTS PASS!

    }
}
