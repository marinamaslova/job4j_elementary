package ru.job4j.condition;

public class ThreeMax {
    @SuppressWarnings({"checkstyle:NeedBraces", "checkstyle:RightCurly"})
    public static int max(int first, int second, int third) {
        int result = first;
        if (first >= second && first > third) {
            result = first;
        } else if (second > first && second >= third) {
                result = second;
            } else {
                result = third;
            }
        return result;
        }

}


