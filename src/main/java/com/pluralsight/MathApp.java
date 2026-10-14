package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // question 1: Variables for items
        int bobSalary = 120_000;
        int garySalary = 175_000;
        int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary + ".");

        // question 2: Variables for items
        int carPrice = 35_000;
        int truckPrice = 55_000;
        int lowerCost = Math.min(carPrice,truckPrice);
        System.out.println("The lowest price is " + lowerCost);

        // question 3: Variables for items
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius,2);
        System.out.println(areaOfCircle);

        // question 4: Variables for items
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println(squareRoot);

        // question 5: Variables for items
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        System.out.println(distance);

        // question 6: Variables for items
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("The absolute value of " + negativeValue + " is " + absoluteValue);

        // question 7: Variables for items
        double randomNum = Math.random();
        System.out.println(randomNum);

        // question 8: Variables for items
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        int hours = days * hoursPerDay;
        int minutes = hours * minutesPerHour;

        int seconds = Math.multiplyExact(minutes,secondsPerMinute);
        long milliseconds = Math.multiplyExact(seconds,millisecondsPerSecond);

        System.out.println(minutes);
        System.out.println(milliseconds);

    }
}
