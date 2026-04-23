package Easy;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode l1Cursor = list1;
        ListNode l2Cursor = list2;

        ListNode mergedList = new ListNode();
            ListNode mergedCursor = mergedList;

            while(l1Cursor != null && l2Cursor != null){
                if(l1Cursor.val >= l2Cursor.val){
                    mergedCursor.next = l2Cursor;
                    l2Cursor = l2Cursor.next;
                    mergedCursor = mergedCursor.next;
                    mergedCursor.next = null;

                }
                else{
                    mergedCursor.next = l1Cursor;
                    l1Cursor = l1Cursor.next;
                    mergedCursor = mergedCursor.next;
                    mergedCursor.next = null;
                }
            }
        if (l1Cursor == null) {
            while (l2Cursor != null) {
                mergedCursor.next = l2Cursor;
                mergedCursor = mergedCursor.next;
                l2Cursor = l2Cursor.next;
            }
        }else if(l2Cursor == null){
            while(l1Cursor != null){
                mergedCursor.next = l1Cursor;
                mergedCursor = mergedCursor.next;
                l1Cursor = l1Cursor.next;
            }
        }

        mergedList = mergedList.next;

        while(mergedList != null){
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }
}



