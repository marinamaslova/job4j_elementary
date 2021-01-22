package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double third = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = third + fourth;
        return  Math.sqrt(fifth);
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 5, 7, 3);
        System.out.println("result (2, 5) to (7, 3) " + result);
    }
}
