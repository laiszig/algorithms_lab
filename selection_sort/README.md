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
  - **Deletion**: $O(n)$ — Deleting items involves moving elements or reallocating memory.

### 🔗 Linked Lists
- **Structure**: Items can be stored anywhere in memory.
- **Links**: Each item stores the address of the next item, linking random memory addresses together.
- **Flexibility**: Adding an item is easy—place it anywhere in memory and store the address with the previous item.
- **Efficiency**:
  - **Reading**: $O(n)$ — To access a specific item, you must start from the first item and follow each link.
  - **Insertion**: $O(1)$ — Adding an item does not require moving existing items.
  - **Deletion**: $O(1)$ — Deleting an item does not require moving existing items.

Insertions and deletions are O(1) time only if you can instantly access the element to be deleted. It’s a common practice to keep track of the first and last items in a linked list, so it would take only O(1) time to delete those.
- **Advantages**:
  - Ideal for sequential reading: read one item and follow the link to the next.
- **Limitations**:
  - Poor for random access, as elements are scattered across memory, making direct access impossible.

### 📊 Comparison
- **Arrays**: Best for instant access to random elements.
  - Random access: you can jump to the element you want to read.
- **Linked Lists**: Best for sequential access and easy insertion without memory reallocation.
  - Sequential access: reading the elements one by one, starting at the first element.

### 🔄 Selection Sort

- When sorting an unordered list by selecting each smallest (or largest) item and moving it to a new list in order, this process has a time complexity of **$O(n^2)$** (running through **$O(n)$** elements **$n$** times).
- **Selection Sort** is straightforward but relatively slow, making it less ideal for large datasets.
- **Quicksort**, a more efficient sorting algorithm, performs faster with a time complexity of **$O(n \log n)$**.

## 🔁 Recap
- 🗄️ **Memory**: Computer memory is like a giant set of drawers, each with an address.
- 📦 **Arrays and Lists**: For storing multiple elements, arrays store items contiguously, while lists store items with each element pointing to the next.
- ⚡ **Arrays**: Enable fast reads but have fixed size and contiguous storage requirements.
- 🔗 **Linked Lists**: Offer flexibility with fast inserts and deletes but slower reads due to sequential access.
- 🔢 **Type Consistency**: In arrays, all elements must be of the same type (e.g., all integers or all doubles).