package recursion;

public class ReverseNodesInLinkedListRecursively {
    public static ListNodeR reverseListRecursively(ListNodeR head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNodeR p = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNodeR head = new ListNodeR(1, null);
        head.next = new ListNodeR(2, null);
        head.next.next = new ListNodeR(3, null);

        ListNodeR newHead = reverseListRecursively(head);
        System.out.println(newHead.val);
    }
}

class ListNodeR {
    int val;
    ListNodeR next;

    public ListNodeR() {
    }

    public ListNodeR(int val) {
        this.val = val;
    }

    public ListNodeR(int val, ListNodeR next) {
        this.val = val;
        this.next = next;
    }
}