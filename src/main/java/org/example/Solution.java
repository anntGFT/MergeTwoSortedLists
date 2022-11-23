package org.example;

public class Solution {
    public Solution(){

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode aux = new ListNode();
        ListNode result = aux;

        if(list1 == null){

            return list2;
        }

        if(list2 == null){

            return list1;
        }

        while(list1!=null && list2!=null){

            if(list1.val > list2.val){

                aux.next = list2;

                list2 = list2.next;
            }else{

                aux.next = list1;

                list1 = list1.next;
            }

            aux = aux.next;
        }

        if(list1 == null){

            aux.next = list2;

        }else {

            aux.next = list1;
        }

        return result.next;

    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

        if(list1 == null){

             return list2;
        }

        if(list2 == null){

            return list1;
        }

        if( list1.val < list2.val){

            list1.next = mergeTwoLists2(list1.next, list2);

            return list1;
        }else{

            list2.next = mergeTwoLists2(list1, list2.next);

            return list2;
        }

    }
}
