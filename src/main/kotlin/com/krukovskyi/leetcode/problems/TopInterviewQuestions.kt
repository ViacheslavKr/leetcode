package com.krukovskyi.leetcode.problems

class TopInterviewQuestions {
/*
1480. Running Sum of 1d Array
https://leetcode.com/problems/running-sum-of-1d-array/
 */

    fun runningSum(nums: IntArray): IntArray {
        val r = IntArray(nums.size) { 0 }
        var previousStep = 0

        nums.forEachIndexed { i, e ->
            previousStep = (e + previousStep).also { r[i] = it }

        }
        return r


    }


/*
    3. Longest Substring Without Repeating Characters
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */


    fun lengthOfLongestSubstring(s: String): Int {

        val symbols = linkedSetOf<Char>()
        var maxLength = 0

        s.forEach {
            if (!symbols.add(it)) {
                val i = symbols.iterator()
                do {
                    val current = i.next()
                    i.remove()
                    if (current == it) {
                        break
                    }

                } while (i.hasNext())
                symbols.add(it)
            }

            maxLength = maxOf(maxLength, symbols.size)
        }
        return maxLength
    }


/*
1. Two Sum
https://leetcode.com/problems/two-sum/
 */

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val diffs = mutableMapOf<Int, Int>()

        for (i in 0..nums.lastIndex) {
            val delta = target - nums[i]
            val t = diffs[delta]
            if (t == null) {
                diffs[nums[i]] = i
            } else {
                return arrayOf(t, i).toIntArray()

            }
        }

        return IntArray(0)
    }

    /*
    2. Add Two Numbers
    https://leetcode.com/problems/add-two-numbers/
     */
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        val nextValFun = fun(v1: Int, v2: Int, c: Int): Pair<Int, Int> {
            val sum = v1 + v2 + c
            return sum % 10 to sum / 10
        }

        var p1: ListNode? = l1!!
        var p2: ListNode? = l2!!

        var res = nextValFun.invoke(p1?.`val`!!, p2?.`val`!!, 0)

        val answer = ListNode(res.first)
        var p3 = answer

        p1 = p1.next
        p2 = p2.next

        while (p1 != null || p2 != null || res.second > 0) {
            if (p1 == null && p2 == null) {
                res = 1 to 0

            } else {
                res = nextValFun.invoke(p1?.`val` ?: 0, p2?.`val` ?: 0, res.second)
                p1 = p1?.next
                p2 = p2?.next
            }

            ListNode(res.first).also {
                p3.next = it
                p3 = it
            }
        }

        return answer
    }


}