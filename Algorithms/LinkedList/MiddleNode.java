package LinkedList;

/**
 Author - archit.s
 Date - 16/08/18
 Time - 11:47 PM
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;

        while (end != null){
            if (end.next == null){
                break;
            }
            middle = middle.next;
            end = end.next.next;
        }

        return middle;
    }
    
}
