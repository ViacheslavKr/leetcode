package com.krukovskyi.leetcode.problems

import kotlin.math.absoluteValue

class Problems51_100 {
    /*
    61. Rotate List
     https://leetcode.com/problems/rotate-list/
     */

    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        var head1:ListNode
        var tail:ListNode

        head1 = head!!
        tail = head
        var counter = 0
        while (tail.next != null) {
            counter++
            if (counter == k) {
                head1 = tail
            }

            tail = tail.next!!
        }

        tail.next = head

        return null

    }


    /*
    88. Merge Sorted Array
    https://leetcode.com/problems/merge-sorted-array/
*/
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        var c1 = m - 1
        var c2 = n - 1
        var c = n + m - 1
        do {
            val e1: Int? = if (c1 >= 0) nums1[c1] else null
            val e2: Int? = if (c2 >= 0) nums2[c2] else null

            if (e1 != null && e2 != null) {
                if (e1 >= e2) {
                    nums1[c] = e1
                    c1--
                } else {
                    nums1[c] = e2
                    c2--
                }
            } else {
                if (e1 == null) {
                    nums1[c] = e2!!
                    c2--
                }
                if (e2 == null) {
                    nums1[c] = e1!!
                    c1--
                }
            }
            c--

        } while (c1 >= 0 || c2 >= 0)
    }


}


