package medium;

import Easy.ListNode;

public class RotateList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode rotatedHead = rotateRight(head, k);

        // Print the rotated list
        printList(rotatedHead);
    }

    public static  void  printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0) {
            return head;
        }

        // Compute the length of the list and get the tail node
        ListNode tail = head;
        int length = 1;
        while(tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head;
        int currentIndex =1;
        int newIndex = (currentIndex + k) % length;
        ListNode newHead = head;
        while(newIndex != 1){
            newHead = newHead.next;
            currentIndex++;
            newIndex = (currentIndex + k) % length;
        }
        ListNode newTail = newHead;
        while(newTail.next != newHead){
            newTail = newTail.next;
        }
        newTail.next = null;
        return newHead;
    }

}
