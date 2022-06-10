package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {




    @Test
    fun romanToInt() {
        val solution = SolutionRomanToInt()
        assertEquals(1, solution.romanToInt("I"))
        assertEquals(5, solution.romanToInt("V"))
        assertEquals(10, solution.romanToInt("X"))
        assertEquals(11, solution.romanToInt("XI"))
        assertEquals(6, solution.romanToInt("VI"))
        assertEquals(2, solution.romanToInt("II"))
        assertEquals(20, solution.romanToInt("XX"))

        assertEquals(9, solution.romanToInt("IX"))

        assertEquals(20, solution.romanToInt("XX"))

        assertEquals(3, solution.romanToInt("III"))
        assertEquals(58, solution.romanToInt("LVIII"))
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }


}