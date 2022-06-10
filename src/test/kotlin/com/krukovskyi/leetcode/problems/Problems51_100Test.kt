package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Problems51_100Test {

    val ut =  Problems51_100()
    @Test
    fun merge() {
        val a = intArrayOf(1,2,3,0,0,0)
        ut.merge(a,3, intArrayOf(2,5,6),3)
        assertArrayEquals(intArrayOf(1,2,2,3,5,6), a )

    }
}