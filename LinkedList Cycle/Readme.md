Here's a simple README file format that focuses on the input and output for the LinkedListCycle example:

---

# Linked List Cycle Detection

## Description
This program detects if a linked list has a cycle using Floyd's Cycle Detection Algorithm (Tortoise and Hare).

## Input
The linked list is represented by a series of `ListNode` objects, where each node has:
- `val`: An integer value.
- `next`: A reference to the next node in the list.

### Example Input
```plaintext
node1 = ListNode(3)
node2 = ListNode(2)
node3 = ListNode(0)
node4 = ListNode(-4)

node1.next = node2
node2.next = node3
node3.next = node4
node4.next = node2 // Creates a cycle
```

## Output
The program outputs a boolean value indicating whether the linked list contains a cycle.

### Example Output
```plaintext
Has cycle: true
```

---

Feel free to modify it further based on your needs!