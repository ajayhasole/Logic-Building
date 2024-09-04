# Circular Queue Implementation

## Overview

The `Circlurqueue` class is a Java implementation of a circular queue data structure. A circular queue uses a fixed-size array to store elements and allows the end of the queue to wrap around to the beginning, making efficient use of space.

## Features

- **Enqueue**: Add elements to the rear of the queue.
- **Dequeue**: Remove elements from the front of the queue.
- **Display**: Print all elements in the queue from front to rear.
- **Overflow and Underflow Checks**: Handle cases where the queue is full or empty.

## Example

### Example Usage

```java
public static void main(String[] args) {
    Circlurqueue cq = new Circlurqueue(5);
    cq.add(10);
    cq.add(20);
    cq.add(30);
    cq.add(40);
    cq.add(50);
    cq.display(); // Output: 10 20 30 40 50
    System.out.println(cq.remove()); // Output: 10
    System.out.println(cq.remove()); // Output: 20
    System.out.println(cq.remove()); // Output: 30
    System.out.println(cq.remove()); // Output: 40
    System.out.println(cq.remove()); // Output: 50
    System.out.println(cq.remove()); // Output: Queue Is Underflow -1
}
