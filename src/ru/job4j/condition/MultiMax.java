package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                return first;
            }
        } else {
            if (second > third) {
                return second;
            }
        }
        return third;
    }
}