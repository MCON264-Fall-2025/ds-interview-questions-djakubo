package edu.touro.mcon264.s3_balanced_parentheses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "{[()]}",
            "(()())",
            "(){[]}"
    })
    void balancedTest(String input){
        Solution newString = new Solution(input);
        assertTrue(newString.isBalanced());
    }

    @ParameterizedTest
    @CsvSource({
            "{[()}]",
            "((())",
            "){[]}("
    })
    void unbalancedTest(String input){
        Solution newString = new Solution(input);
        assertFalse(newString.isBalanced());
    }
}