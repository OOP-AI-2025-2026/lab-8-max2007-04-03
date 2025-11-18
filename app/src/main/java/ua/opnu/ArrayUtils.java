package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayUtils {

    public static <T> T[] filter(T[] input, Predicate<T> p) {
        T[] result = (T[]) new Object[input.length];
        int counter = 0;
        for (T element : input) {
            if (p.test(element)) {
                result[counter] = element;
                counter++;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }
}