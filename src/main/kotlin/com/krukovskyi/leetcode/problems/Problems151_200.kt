package com.krukovskyi.leetcode.problems

import kotlin.math.absoluteValue

class Problems151_200 {
    /*
    160. Intersection of Two Linked Lists
    https://leetcode.com/problems/intersection-of-two-linked-lists/
    */
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {

        val size = fun(head: ListNode): Int {
            var result = 1;
            var current: ListNode = head
            while (current.next != null) {
                result++
                current = current.next!!

            }
            return result
        }


        val sizeA = size(headA!!)
        val sizeB = size(headB!!)

        val skipSize = if (sizeA > sizeB) sizeA - sizeB else sizeB - sizeA


        var pA = headA
        var pB = headB


        if (sizeA != sizeB) {
            if (sizeA > sizeB) {
                for (i in 1..skipSize) {
                    pA = pA!!.next
                }
            } else {
                for (i in 1..skipSize) {
                    pB = pB!!.next
                }
            }
        }
        for (i in 1..minOf(sizeA, sizeB)) {
            if (pA == pB) {
                return pA
            }
            pA = pA!!.next
            pB = pB!!.next

        }


        return null
    }

    /*
    167. Two Sum II - Input Array Is Sorted
     Two Sum II - Input Array Is Sorted
     */

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val additions = mutableMapOf<Int, Int>()
        numbers.forEachIndexed { index, v ->

             additions[v].run {
                if ( this != null) {
                    return intArrayOf(this + 1, index + 1)
                } else {
                    additions[target - v] = index
                }
            }
        }
        return intArrayOf()
    }
}


