package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DailyChallengeTest {
    private val ut = DailyChallenge()


    @Test
    fun transpose() {
/*
assertArrayEquals(
            arrayOf(intArrayOf(),intArrayOf(),intArrayOf()),
            ut.transpose(arrayOf(intArrayOf(),intArrayOf(),intArrayOf(),))
        )
 */

        assertArrayEquals(
            arrayOf(intArrayOf(5),intArrayOf(8),),
            ut.transpose(arrayOf(intArrayOf(5,8)))
        )

        assertArrayEquals(
            arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6)),
            ut.transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)))
        )


        assertArrayEquals(
            arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)),
            ut.transpose(arrayOf(intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), intArrayOf(3, 6, 9)))
        )




    }
}