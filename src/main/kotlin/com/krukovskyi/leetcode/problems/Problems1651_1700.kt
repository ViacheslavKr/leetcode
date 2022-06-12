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

}


