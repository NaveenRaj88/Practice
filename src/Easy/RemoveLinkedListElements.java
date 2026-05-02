package Easy;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;
        System.out.println(removeElements(head, val));
    }

    public static ListNode removeElements(ListNode head, int val){
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode current = head;
        while(current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
            return head;

    }
}
