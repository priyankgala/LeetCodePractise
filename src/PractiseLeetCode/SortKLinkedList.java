/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author Priyank
 */
class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; 
     
     }}
public class SortKLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode init = null;
        int listsLength = lists.length;
        if (listsLength == 0) {
            return init;
        } else if (listsLength == 1) {
            return lists[0];
        } else if (listsLength >= 2) {
            init = mergeTwoLists(lists[0], lists[1]);
        }    
        for (int i = 2; i < listsLength; i++) {
            init = mergeTwoLists(init, lists[i]);
        }   
        return init;
    }  
    public ListNode mergeTwoLists(ListNode one, ListNode two) {
        if (one == null) {
            return two;
        } else if (two == null) {
            return one;
        }
        
        ListNode  res;
        if (one.val > two.val) {
            res = new ListNode(two.val);
            res.next = mergeTwoLists(one, two.next);
        } else {
            res = new ListNode(one.val);
            res.next = mergeTwoLists(one.next, two);
        }      
        return res;
    }
}
