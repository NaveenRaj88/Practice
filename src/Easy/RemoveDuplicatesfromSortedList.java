package Easy;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);


        ListNode cursor = head;

        while(cursor != null) {
            if (cursor.next != null && cursor.val == cursor.next.val) {
                cursor.next = cursor.next.next;
            }

            else{
                cursor = cursor.next;
            }
        }
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
