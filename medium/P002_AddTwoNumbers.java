import java.util.*;

class P002_AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode head = new ListNode(0);
      ListNode curr = head;
      int carry = 0;
      while(l1 != null || l2 != null || carry != 0) {
          int sum = 0;
          if(l1 != null) {
              sum += l1.val;
              l1 = l1.next;
          }
          if(l2 != null) {
              sum += l2.val;
              l2 = l2.next;
          }
          sum += carry;
          carry = sum / 10;
          ListNode n = new ListNode(sum % 10);
          curr.next = n;
          curr = curr.next;
      }
      return head.next;
  }}

/** Definition for singly-linked list. */
class ListNode {
  int val;
  ListNode next;
  ListNode(int val) {
    this.val = val;
    next = null;
  }
}
