package com.krukovskyi.leetcode.problems

class DailyChallenge {

    /*
    867. Transpose Matrix
    https://leetcode.com/problems/transpose-matrix/
     */

    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val result = Array(matrix[0].size) { IntArray(matrix.size) }
        for (y in 0..matrix.lastIndex) {
            for (x in matrix[y].lastIndex..matrix[y].lastIndex) {
                if (x <= matrix.lastIndex && x != y && y <= matrix[x].lastIndex) {
                    result[y][x] = matrix[x][y]
                }
                result[x][y] = matrix[y][x]
            }

        }
        return result
    }

}