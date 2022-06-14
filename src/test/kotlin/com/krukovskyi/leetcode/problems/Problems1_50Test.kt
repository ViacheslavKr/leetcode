package com.krukovskyi.leetcode.problems

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Problems1_50Test {
    val ut = Problems1_50()

    @Test
    fun longestPalindrome() {
        assertEquals("aaaa", ut.longestPalindrome("aaaa"))
        // assertEquals("bab", ut.longestPalindrome("babad"))
        //   assertEquals("a", ut.longestPalindrome("a"))
    }

    @Test
    fun mergeTwoLists() {
        print("7777777" + ut.mergeTwoLists(null, ListNode(0)))
    }

    @Test
    fun strStr() {
        assertEquals(0, ut.strStr("a", "a"))
        assertEquals(-1, ut.strStr("aaaa", "bba"))
        assertEquals(4, ut.strStr("mississippi", "issip"))
    }

    @Test
    fun isPalindr() {
        assertEquals(false, ut.isPalindrome(120))
        //assertEquals(false, ut.isPalindrome(1200))
        //assertEquals(false, ut.isPalindrome(1))
    }
}