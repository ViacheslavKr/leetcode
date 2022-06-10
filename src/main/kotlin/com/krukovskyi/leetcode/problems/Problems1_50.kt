package com.krukovskyi.leetcode.problems

import kotlin.math.absoluteValue

class Problems1_50 {
    /*
    5. Longest Palindromic Substring
    https://leetcode.com/problems/longest-palindromic-substring/
     */
    fun longestPalindrome(s: String): String {

        fun getPalindrSize(s: String): String {
            var p1 = 0
            var p2 = s.lastIndex

            var size = 0
            while (p1 <= p2) {
                if (s[p1] == s[p2]) {
                    size += if (p1 == p2) 1 else 2
                    p1++
                    p2--
                } else {
                    p1 = 0
                    if (size == 0) {
                        p2--
                    }
                    size = 0

                }

            }
            return if (size > 1) s.substring(p2, p1 + 1) else s[0].toString()
        }

        var maxString = ""
        for (startIndex in 0 until s.length) {
            val currentPalindrom = getPalindrSize(s.substring(startIndex))
            if (maxString.length < currentPalindrom.length) maxString = currentPalindrom
        }


        return maxString
    }


}


