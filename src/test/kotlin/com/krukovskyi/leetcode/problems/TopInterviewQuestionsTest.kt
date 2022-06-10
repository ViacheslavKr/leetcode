package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TopInterviewQuestionsTest {
    private val underTest = TopInterviewQuestions()

    @Test
    fun runningSum() {
        assertArrayEquals(intArrayOf(1,3,6,10), underTest.runningSum(intArrayOf(1,2,3,4)))
        assertArrayEquals(intArrayOf(1,2,3,4,5), underTest.runningSum(intArrayOf(1,1,1,1,1)))
        assertArrayEquals(intArrayOf(3,4,6,16,17), underTest.runningSum(intArrayOf(3,1,2,10,1)))
    }


    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(3, underTest.lengthOfLongestSubstring("dvdf"))
        assertEquals(3, underTest.lengthOfLongestSubstring("aabaab!bb"))



        assertEquals(6, underTest.lengthOfLongestSubstring("ohvhjdml"))

        assertEquals(2, underTest.lengthOfLongestSubstring("aab"))
        assertEquals(1, underTest.lengthOfLongestSubstring(" "))
        assertEquals(3, underTest.lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, underTest.lengthOfLongestSubstring("bbbbb"))


        assertEquals(3, underTest.lengthOfLongestSubstring("pwwkew"))









    }


    @Test
    fun twoSum() {
        assertArrayEquals(intArrayOf(0, 1), underTest.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun addTwoNumbers() {
        val n11 = ListNode(2)
        val n12 = ListNode(4)
        val n13 = ListNode(3)

        val n21 = ListNode(5)
        val n22 = ListNode(6)
        val n23 = ListNode(4)

        n21.next = n22
        n22.next = n23

        n11.next = n12
        n12.next = n13



        underTest.addTwoNumbers(n11, n21)
    }


}