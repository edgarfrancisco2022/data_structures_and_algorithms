package recursion;

public class SwapNodesInLinkedList {
    public static ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }

        //Nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        // Swapping
        firstNode.next  = swapPairs(secondNode.next);
        secondNode.next = firstNode;

        // Now the head is the second node
        return secondNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);

        System.out.println(swapPairs(head).val);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}
