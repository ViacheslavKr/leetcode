package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems1_50Test {
       val  ut = Problems1_50()
    @Test
    fun longestPalindrome() {
        assertEquals("aaaa", ut.longestPalindrome("aaaa"))
       // assertEquals("bab", ut.longestPalindrome("babad"))
     //   assertEquals("a", ut.longestPalindrome("a"))
    }
}