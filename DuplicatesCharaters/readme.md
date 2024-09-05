# DuplicatesChars Java Program

## Overview

The `DuplicatesChars` Java program is a simple utility that identifies and counts duplicate characters in a given string. It first sorts the characters in the string, then counts occurrences of each character, and finally prints out any characters that appear more than once along with their counts.

## Code Explanation

### `duplicate(String str)`

- **Purpose**: This method processes a given string to identify and count duplicate characters.
- **Steps**:
  1. Convert the string into a character array.
  2. Sort the character array.
  3. Iterate through the sorted array and count consecutive occurrences of each character.
  4. Print characters that appear more than once along with their counts.

### `main(String[] args)`

- **Purpose**: This is the entry point of the program. It initializes a string and calls the `duplicate` method to process and display duplicate characters.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/your-repo.git
