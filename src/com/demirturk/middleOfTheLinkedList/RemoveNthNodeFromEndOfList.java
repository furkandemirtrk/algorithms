package com.demirturk.middleOfTheLinkedList;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ListNode ln2 = new ListNode(2, ln);
        ListNode ln3 = new ListNode(3, ln2);
        ListNode ln4 = new ListNode(4, ln3);
        ListNode ln5 = new ListNode(5, ln4);
        System.out.println(removeNthFromEnd(ln5, 2).toString());
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return new ListNode();
        ListNode ln = head;
        int count = 0;
        while (ln != null) {
            count++;
            ln = ln.next;
        }
        if(n == count) return head.next;

        int remove = count - n;
        int i = 1;
        ListNode lnRes = head;
        while (i < remove) {
            lnRes = lnRes.next;
            i++;
        }
        lnRes.next = lnRes.next.next;
        return head;
    }
}
