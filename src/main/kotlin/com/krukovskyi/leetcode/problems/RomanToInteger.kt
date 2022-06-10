package com.krukovskyi.leetcode.problems

//https://leetcode.com/problems/roman-to-integer/


class SolutionRomanToInt {

    fun romanToInt(s: String): Int {
        val literals: Map<Char, Int> =
            mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
        var index = 0
        var result = 0

        do {
            val v1 = literals[s[index]]!!
            val v2: Int = if (index < s.lastIndex) literals[s[index + 1]]!! else 0
            index++
            result += if (v1 >= v2 || v2 == 0) {
                v1
            } else {
                index++
                v2 - v1
            }
        } while (index <= s.lastIndex)
        return result

    }

}