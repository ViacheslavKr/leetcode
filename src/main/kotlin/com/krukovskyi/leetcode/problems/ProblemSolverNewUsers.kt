package com.krukovskyi.leetcode.problems

import java.util.*




/**

Challenges for New Users
https://leetcode.com/problem-list/challenges-for-new-users/
 **/


class ProblemSolverNewUsers {




    /*
    1672. Richest Customer Wealth
    https://leetcode.com/problems/richest-customer-wealth/
     */
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = Int.MIN_VALUE
        for (client in accounts) {
            val sum = client.sum()
            if (sum > max) {
                max = sum
            }
        }
        return max
    }

/*
1342. Number of Steps to Reduce a Number to Zero
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */

    fun numberOfSteps(num: Int): Int {
        var answer = 0

        var current = num
        while (current > 0) {
            answer++
            if (current % 2 == 0) {
                current /= 2
            } else {
                current -= 1
            }
        }
        return answer
    }




/*
1337. The K Weakest Rows in a Matrix
https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */

    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val temp = mutableMapOf<Int, Int>()

        mat.mapIndexed { index, ints ->
            temp[index] = ints.sum()
        }
        return temp.entries.sortedBy { it.value }.take(k).map { it.key }.toIntArray()
    }

    //412. Fizz Buzz
//https://leetcode.com/problems/fizz-buzz/
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map { i ->
            when {
                i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                i % 5 == 0 -> "Buzz"
                i % 3 == 0 -> "Fizz"
                else -> i.toString()
            }
        }.toList()
    }

    /*
    876. Middle of the Linked List
    https://leetcode.com/problems/middle-of-the-linked-list/
     */
    fun middleNode(head: ListNode?): ListNode? {

        var pointer = head
        var answer: ListNode = head!!
        var index = 1

        do {
            pointer = pointer?.next
            if (index++ % 2 == 0) {
                answer = answer.next!!
            }
        } while (pointer != null)
        return answer
    }


    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) {
            return false
        }

        val stack = Stack<Int>()
        stack.push(head.`val`)
        var pointer = head.next
        var counter = 1
        while (pointer != null) {
            stack.push(pointer.`val`)
            pointer = pointer.next
            counter++
        }

        pointer = head


        for (index in 1..counter / 2) {
            if (pointer?.`val` != stack.pop()) {
                return false
            } else {
                pointer = pointer!!.next
            }
        }
        return true
    }

    /*
    383. Ransom Note
    https://leetcode.com/problems/ransom-note/
     */
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomNoteMap = mutableMapOf<Char, Int>()
        var ransomNoteCount = ransomNote.length

        for (element in ransomNote) {
            ransomNoteMap.merge(element, 1) { t, u -> t + u }
        }

        for (e in magazine) {
            val letterCount = ransomNoteMap[e]
            if (letterCount != null && letterCount > 0) {
                ransomNoteMap[e] = letterCount - 1
                ransomNoteCount -= 1
                if (ransomNoteCount == 0) {
                    return true
                }
            }

        }
        return false
    }

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}