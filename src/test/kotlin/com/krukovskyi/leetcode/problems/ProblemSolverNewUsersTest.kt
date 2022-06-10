package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class ProblemSolverNewUsersTest {
    private val underTest = ProblemSolverNewUsers()

    @Test
    fun isPalindrome() {
        val head = ListNode(1)
        val i3 = ListNode(1)
        val i2 = ListNode(3)
        i2.next = i3
        val i1 = ListNode(2)
        i1.next = i2
        head.next = i1

        head.next = i1

        assertTrue(underTest.isPalindrome(head))
    }


    @Test
    fun canConstruct() {

        assertFalse(underTest.canConstruct("a", "b"))
        assertFalse(underTest.canConstruct("aa", "ab"))
        assertTrue(underTest.canConstruct("aa", "aba"))
    }


    @Test
    fun maximumWealth() {
        Assertions.assertEquals(6, underTest.maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(1, 2, 3))))
    }
}