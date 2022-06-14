package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems101_150Test {
    private val ut = Problems101_150()

    @Test
    fun minimumTotal() {
        assertEquals(11, ut.minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))))
        assertEquals(-10, ut.minimumTotal(listOf(listOf(-10))))
    }
}