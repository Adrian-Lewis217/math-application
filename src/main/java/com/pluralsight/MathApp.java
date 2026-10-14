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
        System.out.println(lowerCost);
    }
}
