package org.example;


import java.util.Arrays;

public class Triangle {

    public enum Type {
        RIGHT_ANGLED,
        ACUTE_ANGLED,
        OBTUSE_ANGLED,
        INVALID
    }

    public static boolean isValidInput(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean exists(int a, int b, int c) {
        if (!isValidInput(a, b, c)) {
            return false;
        }

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        return (long) sides[0] + sides[1] > sides[2];
    }

    public static Type determineType(int a, int b, int c) {
        if (!exists(a, b, c)) {
            return Type.INVALID;
        }

        int[] sides = {a, b, c};
        Arrays.sort(sides);

        long aSquared = (long) sides[0] * sides[0];
        long bSquared = (long) sides[1] * sides[1];
        long cSquared = (long) sides[2] * sides[2];

        long sum = aSquared + bSquared;

        if (sum == cSquared) {
            return Type.RIGHT_ANGLED;
        } else if (sum > cSquared) {
            return Type.ACUTE_ANGLED;
        } else {
            return Type.OBTUSE_ANGLED;
        }
    }
}
