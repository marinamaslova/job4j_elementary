package ru.job4j.condition;

public class SqArea {
         public static double square(double p, double k) {
            double h = ((k +1) * 2) / p;
            double l = h * k;
            return l * h;
         }

        public static void main(String[] args) {
            double result1 = SqArea.square(6, 2);
            System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        }
}
