/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinja
 *
 */
import java.util.*;

public class addNumbersInLinkedList {

    public static class ListNode {

        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String args[]) {

        ListNode list1 = new ListNode(1);
        
        list1.next = new ListNode(2);
//        ListNode curr1 = list1;
        list1 = list1.next;    
        list1.next = new ListNode(3);
        
        
        list1 = list1.next;
        list1.next = new ListNode(7);
        list1 = list1.next;

//        while(curr1 != null)
//        {
//            System.out.println(""+curr1.val);
//            curr1 = curr1.next;
//        }

//        ListNode list2 = new ListNode(4);
//        ListNode curr2 = list2;
//        list2.next = new ListNode(5);
////        list2.next = new ListNode(6);
//
//        ListNode result = addLinkedList(list1, list2);
//        while (result != null)
//        {
//            System.out.println("Answer is "+ result.val);
//            result = result.next;
//        }
    }

//    private static ListNode addLinkedList(ListNode list1, ListNode list2) {
//
//        ListNode answer = new ListNode(0);
//        ListNode current = answer;
//        int carry = 0;
//
//            while (list1 != null || list2 != null)
//            {
//                int x = (list1 != null)? list1.val: 0;
//                int y = (list2 != null)? list2.val: 0;
//                int sum = carry + x + y;
//                carry = sum / 10;
//                current.next = new ListNode(sum % 10);
//                current = current.next;
//                if(list1 != null)
//                        list1 = list1.next;
//                if(list2 != null)
//                    list2 = list2.next;
//            }
//
//            if(carry > 0){
//                current.next = new ListNode(carry);
//            }
//            return answer.next;
//    }
}
