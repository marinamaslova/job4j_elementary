package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;

            for (int cents : coins) {
                while (change - cents >= 0) {
                    change -= cents;
                    rsl[size] = cents;
                    size += 1;
                 }
            }

        return Arrays.copyOf(rsl, size);
    }
}