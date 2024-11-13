# 💻 Memory, Arrays, and Linked Lists

### 📦 Memory Slots
- The computer has slots of memory, each with an address.
- When storing something, the computer assigns an address for storage.
- For storing multiple items, the two basic methods are **Arrays** and **Lists**.

---

## 📑 Arrays and Linked Lists

### 🗂️ Arrays
- **Structure**: Items are stored contiguously (right next to each other) in memory.
- **Fixed Size**: If you want to add another item, you can’t. You’d need to find a new contiguous block of memory to fit all items and move them there.
- **Position (Index)**: Arrays start at 0, and each item has an index.
- **Efficiency**:
  - **Reading**: $O(1)$ — You can look up any element instantly by its index.
  - **Insertion**: $O(n)$ — Adding items involves moving elements or reallocating memory.

### 🔗 Linked Lists
- **Structure**: Items can be stored anywhere in memory.
- **Links**: Each item stores the address of the next item, linking random memory addresses together.
- **Flexibility**: Adding an item is easy—place it anywhere in memory and store the address with the previous item.
- **Efficiency**:
  - **Reading**: $O(n)$ — To access a specific item, you must start from the first item and follow each link.
  - **Insertion**: $O(1)$ — Adding an item does not require moving existing items.
- **Advantages**:
  - Ideal for sequential reading: read one item and follow the link to the next.
- **Limitations**:
  - Poor for random access, as elements are scattered across memory, making direct access impossible.

### 📊 Comparison
- **Arrays**: Best for instant access to random elements.
- **Linked Lists**: Best for sequential access and easy insertion without memory reallocation.

