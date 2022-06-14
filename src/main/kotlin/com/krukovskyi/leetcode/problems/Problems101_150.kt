package com.krukovskyi.leetcode.problems



class Problems101_150 {
    /*
120. Triangle
https://leetcode.com/problems/triangle/
     */
    fun minimumTotal(triangle: List<List<Int>>): Int {
        val cache = mutableMapOf<Pair<Int, Int>, Int>()
        fun getMin(t: List<List<Int>>, c: Pair<Int, Int>, cMin: Int, cache: MutableMap<Pair<Int, Int>, Int>): Int {

            return if (c.first == t.lastIndex) {
                val v = t[c.first][c.second]
                cache.putIfAbsent(c, v)
                v
            } else {
                val lV = cache[c.first + 1 to c.second] ?: getMin(t, c.first + 1 to c.second, cMin, cache)
                val rV = cache[c.first + 1 to c.second + 1] ?: getMin(t, c.first + 1 to c.second + 1, cMin, cache)
                val v = t[c.first][c.second] + minOf(rV, lV)

                cache.putIfAbsent(c.first + 1 to c.second, lV)
                cache.putIfAbsent(c.first + 1 to c.second + 1, rV)
                cache.putIfAbsent(c, v)
                v
            }
        }
        return getMin(triangle, 0 to 0, Int.MAX_VALUE, cache)
    }


}


