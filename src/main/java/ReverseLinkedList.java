class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if(head == null){return null;}
        ListNode temp = null;
        ListNode after;
        while(head.next != null){

            after = head.next;
            head.next = temp;
            temp = head;
            head = after;
        }

        head.next = temp;

        return head;
    }

}
