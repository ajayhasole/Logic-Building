##Diagonal Difference
##Problem Statement

Given a square matrix, calculate the absolute difference between the sums of its diagonals.
Input

    The first line contains an integer nn, the size of the n×nn×n matrix.
    The next nn lines contain nn integers each, representing the elements of the matrix.

##Example Input

3
11 2 4
4 5 6
10 8 -12

##Output

    Output a single integer representing the absolute difference between the sums of the two diagonals.

##Example Output

15

##Explanation

For the example input, the sums of the diagonals are:

    Primary diagonal (from top-left to bottom-right): 11+5+−12=411+5+−12=4
    Secondary diagonal (from top-right to bottom-left): 4+5+10=194+5+10=19

The absolute difference is ∣4−19∣=15∣4−19∣=15.