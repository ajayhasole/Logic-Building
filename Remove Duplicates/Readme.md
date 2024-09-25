##RemoveDuplicates
##Description

This Java program defines a method to remove duplicate characters from a given string while maintaining the original order of their first occurrences.
Input

    A string s that may contain duplicate characters.

#Output

    A new string with all duplicate characters removed, preserving the order of their first appearance.

#Example
#Input

arduino

"banana"

Output

arduino

"ban"

#How It Works

    The program uses a LinkedHashSet to store characters from the input string.
    As LinkedHashSet does not allow duplicates and maintains insertion order, it effectively filters out duplicate characters while keeping their order intact.
    The final result is built by appending each unique character from the set into a StringBuilder, which is then converted back to a string and returned.