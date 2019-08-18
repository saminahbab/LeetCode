public class MiddleLinkedList {

    
    public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }


    public ListNode middleNode(ListNode head) {
        // get the middle of the Linked List.



        // get the middle of the Linked List.


        int counter = 1;
        ListNode pointer = head;

        while(pointer.next != null){

            pointer = pointer.next;
            counter ++;
        }

        /*
        we want to
         */

        counter = (counter / 2) + 1;

        while(counter > 1 && head.next != null){
            head = head.next;
            counter --;
        }

        return head;

    }

}
