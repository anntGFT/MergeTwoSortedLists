package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    ListNode listNode1;
    ListNode listNode2;
    ListNode result;

    @BeforeAll
    static void setup(){
        solution = new Solution();
    }

    @Test
    public void gettingTwoEmptyLists(){
        listNode1 = null;
        listNode2 = null;
        result = null;

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists(listNode1,listNode2)));

    }

    @Test
    public void gettingOneEmptyLists(){
        listNode1 = new ListNode(12, new ListNode(2, new ListNode(3)));
        listNode2 = null;
        result = new ListNode(12, new ListNode(2, new ListNode(3)));

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists(listNode1,listNode2)));

    }

    @Test
    public void gettingTwoLists(){
        listNode1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        listNode2 = new ListNode(2, new ListNode(6, new ListNode(8)));
        result = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(8))))));

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists(listNode1,listNode2)));

    }

    @Test
    public void gettingTwoEmptyListsWithRecursion(){
        listNode1 = null;
        listNode2 = null;
        result = null;

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists2(listNode1,listNode2)));

    }

    @Test
    public void gettingOneEmptyListsWithRecursion(){
        listNode1 = new ListNode(12, new ListNode(2, new ListNode(3)));
        listNode2 = null;
        result = new ListNode(12, new ListNode(2, new ListNode(3)));

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists2(listNode1,listNode2)));

    }

    @Test
    public void gettingTwoListsWithRecursion(){
        listNode1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        listNode2 = new ListNode(2, new ListNode(6, new ListNode(8)));
        result = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(6, new ListNode(8))))));

        assertEquals(ListNode.print(result), ListNode.print(solution.mergeTwoLists2(listNode1,listNode2)));

    }
}
