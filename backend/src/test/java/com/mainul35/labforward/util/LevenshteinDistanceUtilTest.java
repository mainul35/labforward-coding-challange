package com.mainul35.labforward.util;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LevenshteinDistanceUtilTest {

    @Test
    @DisplayName ("Test case for only one character change")
    public void whenOnlyOneChangeIsNeeded () {
        var isValid = LevenshteinDistanceUtil.isWithinLevenshteinDistanceBounds ("Word", "Words");
        Assertions.assertTrue (isValid, "Test case for only one character change will return true");
    }

    @Test
    @DisplayName ("Words with different lengths")
    public void whenTheWordLengthsAreNotSame () {
        var isInvalid = LevenshteinDistanceUtil.isWithinLevenshteinDistanceBounds ("Word", "Wordssss");
        Assertions.assertFalse (isInvalid, "Words with different lengths will return false");
    }

    @Test
    @DisplayName ("Words with same lengths and no character change")
    public void whenTheWordLengthsAreSameButNothingToChange () {
        var isInvalid = LevenshteinDistanceUtil.isWithinLevenshteinDistanceBounds ("Word", "Word");
        Assertions.assertFalse (isInvalid, "Words with same lengths and no character change will return false");
    }
}
