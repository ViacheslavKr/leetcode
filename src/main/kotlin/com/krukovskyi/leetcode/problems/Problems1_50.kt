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

    /*
    9. Palindrome Number

    https://leetcode.com/problems/palindrome-number/
     */

    fun isPalindrome(x: Int): Boolean {
        fun pov10(x: Int): Int {
            var r = 1
            (1..x).forEach { _ -> r *= 10 }
            return r
        }


        var length = 1

        while (x / pov10(length) > 0) {
            length++
        }

        println(x)

        var t = x
        println("x = $t  ")
        for (s in length -1 downTo 1) {

            println("t = $t   ${pov10(s)}: ${t % pov10(s)}")
            t = t/10

        }



        return false
    }

    /*
    21. Merge Two Sorted Lists
     */
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val res: ListNode? = ListNode(0)
        var current = res
        var p1 = list1
        var p2 = list2

        while (p1 != null || p2 != null) {
            if (p1 != null && p2 != null) {
                if (p1.`val` < p2.`val`) {
                    current!!.next = p1
                    p1 = p1.next
                } else {
                    current!!.next = p2
                    p2 = p2.next
                }

            } else {
                if (p1 == null) {
                    current!!.next = p2
                    p2 = p2?.next
                } else {
                    current!!.next = p1
                    p1 = p1.next
                }
            }
            current = current.next

        }
        return res?.next
    }

    /*
    27. Remove Element
    https://leetcode.com/problems/remove-element/
     */
    fun removeElement(nums: IntArray, `val`: Int): Int {
        return nums.filter { it != `val` }.mapIndexed { index: Int, i: Int -> nums[index] = i }.count()
    }
    /*
    28. Implement strStr()
    https://leetcode.com/problems/implement-strstr/
     */

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        var matchCounter = 0

        var p1 = 0
        while (p1 < haystack.length) {
            while (p1 < haystack.lastIndex && haystack[p1] != needle.first()) {
                p1++

            }
            var p2 = 0
            matchCounter = 0

            while (p1 + p2 < haystack.length && haystack[p1 + p2] == needle[p2]) {
                p2++
                matchCounter++
                if (matchCounter == needle.length) {
                    return p1
                }
            }
            p1++
        }
        return -1
    }
}


