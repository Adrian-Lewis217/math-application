package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // question 1: Variables for items
        int bobSalary = 120_000;
        int garySalary = 175_000;
        int highestSalary = Math.max(bobSalary,garySalary);

        // print the highest salary
        System.out.println("The highest salary is " + highestSalary + ".");

        // question 2: Variables for items
        int carPrice = 35_000;
        int truckPrice = 55_000;
        int lowerCost = Math.min(carPrice,truckPrice);

        // print the lowest price
        System.out.println("The lowest price is " + lowerCost);

        // question 3: Variables for items
        double radius = 7.25;
        double areaOfCircle = Math.pow(radius,2);

        // print the answer
        System.out.println(areaOfCircle);

        // question 4: Variables for items
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        // print the answer
        System.out.println(squareRoot);

        // question 5: Variables for items
        double point1 = 5;
        double point2 = 10;
        double point3 = 85;
        double point4 = 50;
        double distance = Math.sqrt(Math.pow(point2 - point1,2) + Math.pow(point3 - point4,2));

        // print the distance
        System.out.println(distance);

    }
}
