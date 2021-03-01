package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
              for (int point  = index; point < array.length; point++) {
                    if (array[point] != null) {
                        String temp = array[index];
                        array[index] = array[point];
                        array[point] = temp;
                        break;
                    }

                    /* переместить первую не null ячейку. Нужен цикл. */
                }

            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String test : compressed) {
            System.out.print(test + " ");
        }
    }
}


