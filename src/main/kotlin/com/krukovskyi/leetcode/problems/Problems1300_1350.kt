package com.krukovskyi.leetcode.problems


class Problems1300_1350 {
    /*
    1332. Remove Palindromic Subsequences
     https://leetcode.com/problems/remove-palindromic-subsequences/

     !!!!!!!!!!!!!!!!!!!!!
     THis task is really strange

     */

    fun removePalindromeSub(s: String): Int {

        fun getPalindrSize(s: String): Int {
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
            return size
        }



        return if (getPalindrSize(s) == s.length) {
            1
        } else {
            2
        }


    }


}


