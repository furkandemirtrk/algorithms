package com.demirturk.middleOfTheLinkedList;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ListNode ln2 = new ListNode(2,ln);
        ListNode ln3 = new ListNode(3,ln2);
        ListNode ln4 = new ListNode(4,ln3);
        ListNode ln5 = new ListNode(5,ln4);
        System.out.println(middleNode(ln5));
    }

    public static ListNode middleNode(ListNode head) {
            ListNode ln = head;
            ListNode lnRes = new ListNode();
            int count = 1;
            while(ln.next != null){
                count++;
                ln = ln.next;
            }
            count = (count / 2);
            ln=head;
            int i=0;
            while(ln != null){
                if(i==count){
                    return ln;
                }
                ln = ln.next;
                i++;
            }
            return lnRes;
    }


}
