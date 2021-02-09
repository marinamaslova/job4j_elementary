package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent = (percent / 100);
        double debt = amount + (amount * percent);
        while (debt >= 0) {
            debt = debt - salary;
            debt = debt + debt * percent;
            year = year + 1;
        }
        return year;
    }
}
