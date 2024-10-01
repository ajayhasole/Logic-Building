# ArrayRotation

## Description

`ArrayRotation` is a Java program that rotates an array to the right by a specified number of positions. The rotation is performed using a three-step reversal algorithm, which is efficient and operates in linear time with constant space complexity.

## Requirements

- Java Development Kit (JDK)

## Setup

1. **Clone or Download**: You can clone or download this repository to your local machine.

2. **Compile the Program**: Use your preferred IDE or command line to compile the Java program.

## Input

- **Array**: An integer array that you want to rotate.
- **Rotation Count (`d`)**: The number of positions to rotate the array to the right.

## Output

- **Console Output**: The program prints the original array and the rotated array to the console. 

Example output:
```
Original Array: [1, 2, 3, 4, 5, 6, 7]
Rotated Array: [5, 6, 7, 1, 2, 3, 4]
```

## How to Run

1. Compile and run the `ArrayRotation` class:

   ```bash
   javac ArrayRotation.java
   java ArrayRotation
   ```

2. The program will execute and display the original and rotated arrays in the console.

## Example

For the given input:
```java
int[] array = {1, 2, 3, 4, 5, 6, 7};
int d = 3; // Number of positions to rotate
```

The output will be:
```
Original Array: [1, 2, 3, 4, 5, 6, 7]
Rotated Array: [5, 6, 7, 1, 2, 3, 4]
```

## How It Works

1. **Reversal of the Entire Array**: The entire array is reversed.
2. **Reversal of the First `d` Elements**: The first `d` elements are reversed to restore their order.
3. **Reversal of the Remaining Elements**: The remaining elements (from `d` to end) are reversed to restore their order.

This approach ensures that the elements are efficiently rotated with minimal space usage.



