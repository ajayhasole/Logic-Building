class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node.
        }

        ListNode slow = head; // Tortoise
        ListNode fast = head; // Hare

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow pointer by 1 step
            fast = fast.next.next;     // Move fast pointer by 2 steps

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle detected
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle

        LinkedListCycle cycleDetector = new LinkedListCycle();
        boolean hasCycle = cycleDetector.hasCycle(node1);
        System.out.println("Has cycle: " + hasCycle); // Output: Has cycle: true
    }
}
