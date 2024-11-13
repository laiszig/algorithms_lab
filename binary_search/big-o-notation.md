[Big O Cheatsheet](https://www.bigocheatsheet.com/)
## 📘 BIG O Notation
- Linear time - When the maximum number of guesses is the same as the size of the list.
- Logarithmic time - When complexity grows very slowly relative to the input size, as it repeatedly halves the problem space, requiring only a small number of steps even for large inputs.

It’s not enough to know how long an algorithm takes to run — we need to know how the running time increases as the list size increases. 

Big O notation lets you compare the number of operations. It tells you how fast the algorithm grows.

Big O establishes a worst-case run time.

Most common Big O run times from fastest to slowest:
- $O(log n)$, also known as log time. Example: Binary search.
- $O(n)$, also known as linear time. Example: Simple search.
- $O(n * log n)$. Example: A fast sorting algorithm, like quicksort
- $O(n^2)$. Example: A slow sorting algorithm, like selection sort
- $O(n!)$. Example: A really slow algorithm

### 🔑 Main takeaways:
- Algorithm speed isn’t measured in seconds, but in growth of the
number of operations.
- Instead, we talk about how quickly the run time of an algorithm increases as the size of the input increases.
- Run time of algorithms is expressed in Big O notation.
- O(log n) is faster than O(n), but it gets a lot faster as the list of items you’re searching grows.