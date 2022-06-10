package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems151_200Test {
    val ut = Problems151_200()

    @Test
    fun twoSum() {
        assertArrayEquals(
            intArrayOf(1, 2), ut.twoSum(intArrayOf(2, 7, 11, 15), 9)
        )
    }
}