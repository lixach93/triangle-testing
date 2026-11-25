
package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    // Tests for isValidInput()

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, true",
            "1, 1, 1, true",
            "5, 5, 5, true",
            "0, 3, 4, false",
            "-1, 3, 4, false",
            "3, 0, 4, false",
            "3, 4, -5, false"
    })
    void shouldValidateInput(int a, int b, int c, boolean expected) {
        assertEquals(expected, Triangle.isValidInput(a, b, c));
    }

    // Tests for exists()

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, true",
            "5, 5, 5, true",
            "2, 3, 4, true",
            "1, 2, 3, false",
            "1, 2, 4, false",
            "5, 1, 1, false",
            "0, 3, 4, false",
            "-1, 3, 4, false"
    })
    void shouldCheckTriangleExistence(
            int a, int b, int c, boolean expected) {

        assertEquals(expected, Triangle.exists(a, b, c));
    }

    // Tests for determineType()

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, RIGHT_ANGLED",
            "5, 3, 4, RIGHT_ANGLED",
            "5, 5, 5, ACUTE_ANGLED",
            "4, 5, 6, ACUTE_ANGLED",
            "2, 3, 4, OBTUSE_ANGLED",
            "3, 4, 6, OBTUSE_ANGLED",
            "1, 2, 3, INVALID",
            "1, 2, 4, INVALID",
            "0, 3, 4, INVALID",
            "-1, 3, 4, INVALID"
    })
    void shouldDetermineTriangleType(
            int a, int b, int c, Triangle.Type expected) {

        assertEquals(expected, Triangle.determineType(a, b, c));
    }

    // Additional boundary test

    @Test
    void shouldRecognizeMinimumValidTriangle() {
        assertEquals(
                Triangle.Type.ACUTE_ANGLED,
                Triangle.determineType(1, 1, 1)
        );
    }
}
