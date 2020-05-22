/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.LinkedList;

/**
 *
 * @author kinja
 */
public class D16OddEvenLinkedList {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void main(String args[]) {

        ListNode list = new ListNode(1);
        ListNode head = list;
        list.next = new ListNode(2);
        list = list.next;
        
        list.next = new ListNode(3);
        list = list.next;
        
        list.next = new ListNode(4);
        list = list.next;
        
        list.next = new ListNode(5);
        list = list.next;
        
//        //Printing the ListNode
//        while(head != null){
//            System.out.println(head.val);
//            head= head.next;
//        }
//        
        
        ListNode result = oddEvenList(head);
        
         while(result != null){
            System.out.println(result.val);
            result= result.next;
        }
    }

    
    private static ListNode oddEvenList(ListNode list) {
        
        ListNode odd = list, even = list.next;
        ListNode oddHead = odd, evenHead = even;
        
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        return oddHead;
    }
}
