# 🔍 Binary Search

### 📥 Input
- A sorted list of elements.

### 📤 Return
- If target element is on the list, returns the position where it is located.
- If not, returns null.

### 🔎 Simple Search
- Eliminates one element with each guess.
- **Big O**: $O(n)$

### 🔄 Binary Search
- The algorithm guesses the middle element and eliminates half the remaining elements each time.
- **Big O**: $O(\log_2 n)$

---

# 📘 Logarithms Summary

Logarithms express exponentiation in reverse. A logarithm answers: "To what power must we raise a specific base to get a given number?"

### 🔑 Key Points
- **Definition**: If $b^x = y$, then $log_b(y) = x$.
    - This means the logarithm of $y$ with base $b$ is $x$.

- **Common Bases**:
    - **Base 10 (`log`)**: Often used in scientific notation; called the "common logarithm."
    - **Base \( e \) (`ln`)**: Used frequently in calculus and natural growth models; called the "natural logarithm."
    - **Base 2**: Common in computer science, where binary systems are used.

**Note**: Binary search only works if the list is in sorted order.

Binary search takes a sorted array and an item. If the item is in the array, the function returns its position.

---

# 📝 Exercises

1.1 - Suppose you have a sorted list of 128 names, and you’re searching through it using binary search. What’s the maximum number of steps it would take?

- **A**: $log_2 128 = 7$.

1.2 - Suppose you double the size of the list. What’s the maximum number of steps now?

- **A**: $log_2 256 = 8$.

