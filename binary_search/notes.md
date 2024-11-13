# 🧭 The Traveling Salesperson Problem

A salesperson needs to visit five cities and aims to travel the minimum total distance.

### 📝 Steps
1. Examine every possible order of cities the salesperson could travel.
   - Calculate the total distance for each order and select the path with the shortest distance.
   - **Example**:
      - **5 cities**: 120 possible orders (120 operations).
      - **6 cities**: 720 possible orders.
      - **7 cities**: 5040 possible orders.

### ⏳ Complexity
- For $n$ cities, it requires $n!$ (n factorial) operations to find the solution.
- **Time Complexity**: $O(n!)$
- This exponential growth means factorial time scales extremely poorly, except for the smallest inputs.

**Note**: There is no known efficient algorithm that solves this problem optimally.