package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems1300_1350Test {
    val ut = Problems1300_1350()

    @Test
    fun removePalindromeSub() {
        assertEquals(2,ut.removePalindromeSub("bbaabaaa"))
        assertEquals(1,ut.removePalindromeSub("ababa"))
        assertEquals(2,ut.removePalindromeSub("abb"))
        assertEquals(2,ut.removePalindromeSub("baabb"))
    }
}