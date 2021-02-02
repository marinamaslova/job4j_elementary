package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        if (first > second) {
            return Math.max(first, third);
        } else {
                return Math.max(second, third);
        }
    }
}

