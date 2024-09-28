# Permutations Class

## Overview
The `Permutations` class generates and prints all possible permutations of a given string.

## Input
- **String**: The input string from which permutations are to be generated.
  
  Example:
  - Input: `"abc"`
  
## Output
- The method prints each permutation of the input string on a new line.

  Example:
  - Output for the input `"abc"`:
    ```
    abc
    acb
    bac
    bca
    cab
    cba
    ```

## Usage
To use the `Permutations` class, create an instance of the class and call the `permute` method with the desired string and an empty string for the result.

### Example:
```java
Permutations permutations = new Permutations();
permutations.permute("abc", "");
