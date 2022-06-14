package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems1651_1700Test {
    private val ut = Problems1651_1700()

    @Test
    fun getOpsCount() {
        assertEquals(1, ut.minOperations(intArrayOf(5), 5))
        assertEquals(-1, ut.minOperations(intArrayOf(6), 5))
        assertEquals(2, ut.minOperations(intArrayOf(1, 2), 3))
        assertEquals(-1, ut.minOperations(intArrayOf(2, 2), 3))
        assertEquals(2, ut.minOperations(intArrayOf(1, 1, 4, 2, 3), 5))
        assertEquals(2, ut.minOperations(intArrayOf(1, 1, 3, 4), 5))
        assertEquals(5, ut.minOperations(intArrayOf(3, 2, 20, 1, 1, 3), 10))
    }

    @Test
    fun maximumUniqueSubarray() {
        assertEquals(17, ut.maximumUniqueSubarray(intArrayOf(4,2,4,5,6)))
        assertEquals(8, ut.maximumUniqueSubarray(intArrayOf(5,2,1,2,5,2,1,2,5)))
        assertEquals(5, ut.maximumUniqueSubarray(intArrayOf(5)))
        assertEquals(16911, ut.maximumUniqueSubarray(intArrayOf(187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434)))
    }
}