package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest {

    @Test
    void testNormalString() {
        assertEquals(3, VowelCount.countVowels("Hello World"));
    }

    @Test
    void testAllVowels() {
        assertEquals(5, VowelCount.countVowels("aeiou"));
    }

    @Test
    void testUppercaseVowels() {
        assertEquals(5, VowelCount.countVowels("AEIOU"));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, VowelCount.countVowels("rhythm"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, VowelCount.countVowels(""));
    }

    @Test
    void testMixedCaseString() {
        assertEquals(2, VowelCount.countVowels("ApPlE"));
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class,
                () -> VowelCount.countVowels(null));
    }
}