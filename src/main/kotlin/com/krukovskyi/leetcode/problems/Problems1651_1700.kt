package com.krukovskyi.leetcode.problems


class Problems1651_1700 {
    /*    1658. Minimum Operations to Reduce X to Zero
    https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
    https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/discuss/2136570/Change-Your-Perspective-or-JAVA-Explanation
    */

    fun minOperations(nums: IntArray, x: Int): Int {
        var maxSubArrayToExclude = -1
        val sum = nums.sum()
        var currSum = 0
        var l = 0
        for (r in 0..nums.lastIndex) {
            currSum += nums[r]
            while (l <= r && currSum > sum - x) currSum -= nums[l++]
            if (currSum == sum - x) maxSubArrayToExclude = maxOf(maxSubArrayToExclude, r - l + 1);
        }

        return if (maxSubArrayToExclude == -1) -1
        else {
            nums.size - maxSubArrayToExclude
        }

    }

    /*
    1695. Maximum Erasure Value
    https://leetcode.com/problems/maximum-erasure-value/
     */
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var pR = 0
        var pL = 0
        val subArrayItems = mutableSetOf<Int>()
        var maxScore = 0
        var curScore = 0


        while (pR <= nums.lastIndex) {
            while (!subArrayItems.add(nums[pR])) {
                curScore -= nums[pL]
                subArrayItems.remove(nums[pL++])
            }
            curScore += nums[pR]
            maxScore = maxOf(curScore, maxScore)
            pR++
        }
        return maxScore
    }

}


