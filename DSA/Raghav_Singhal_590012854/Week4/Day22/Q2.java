class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Q2 {
    public static int countFrequency(ListNode head, int key) {
        int count = 0;
        ListNode current = head;

        while (current != null) {
            if (current.val == key) {
                count++;
            }
            current = current.next;
        }

        return count;
    }

    public static void main(String[] args)
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(1);

        int key = 1;
        System.out.println(countFrequency(head, key));
    }
}
