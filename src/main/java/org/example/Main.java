package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 5));


        System.out.println(hasTeen(13, 45, 9));
        System.out.println(hasTeen(20, 22, 25));


        System.out.println(isCatPlaying(true, 40));
        System.out.println(isCatPlaying(false, 36));


        System.out.println(area(5.0, 4.0));
        System.out.println(area(-3.0, 5.0));
        System.out.println(area(3.0));
        System.out.println(area(-2.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }


    private static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
