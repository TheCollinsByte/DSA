# Array

Array is a linear data structure that stores a collection of elements of the same data type. Elements are allocated contiguous memory, allowing for constant-time access. Each element has a unique index number.

## Basic terminologies of Array

- Array Index: In an array, elements are identified by their indexes. Array index starts from 0.
- Array Elements: Elements are items stored in an array and can be accessed by their index.
- Array Length: The Length of an array is determined by the number of elements it can contain.

## Types of Arrays:

- On the basis of Size
- On the basis of dimensions

### Basis of Size

- Fixed Size: We cannot alter or update the size of the array.
- Dynamic Size: The memory is mostly dynamic allocated and de-allocated.

### Basis of Dimensions

- One-Dimensional Array (1D): An array where elements are stored one after another as a row.
- Multi-Dimensional Array (2D, 3D etc): An array with more than one dimension.

## Operations on Arrays:

- Traversal: Iterating through the elements of an array. (e.g: Sequential, Reverse).
- Insertion: Adding an element to the array at a specific index.
- Deletion: Removing an element from the array at a specific index.
- Searching: Finding an element in the array by its value or index.


## Complexity Analysis of Operations on Array

### Time Complexity

| Operation | Best Case | Average Case | Worst Case |
| Traversal |    Ω(N)   |     θ(N)     |    O(N)    |
| Insertion |    Ω(1)   |     θ(N)     |    O(N)    |
| Deletion  |    Ω(1)   |     θ(N)     |    O(N)    |
| Searching |    Ω(1)   |     θ(N)     |    O(N)    |

### Space Complexity

| Operation | Best Case | Average Case | Worst Case |
| Traversal |    Ω(1)   |     θ(1)     |    O(1)    |
| Insertion |    Ω(1)   |     θ(N)     |    O(N)    |
| Deletion  |    Ω(1)   |     θ(N)     |    O(N)    |
| Searching |    Ω(1)   |     θ(1)     |    O(1)    |


## Advantages of Array

- Arrays represent multiple data items of the same type using a single name.
- Arrays have better cache locality which makes a pretty big difference in performance.
- Arrays are used to Implement the other data structures like linked lists, stacks, queues, tree, graphs etc.
- Arrays allow random access to elements. This makes accessing elements in position faster.


## Disadvantages of Array

- Allocating less memory than required to an array leads to loss of data.
- Arrays store data in contiguous memory locations, which makes deletion and insertion very difficult to implement. This problem is overcome by implementing linked lists, which allow elements to be accessed sequentially.
- An array is homogeneous in nature so, a single array cannot store values of different data types.
- As arrays have a fixed size, once the memory is allocated to them, it cannot be increased or decreased, making it impossible to store extra data if required. An array of fixed size is referred to as a static array. 


## Applications of Array:

- Storing data in a sequential manner.
- Implementing queues, array lists, hash tables, heaps, stacks and other data structures.
- Representing matrices and tables.
- Creating dynamic data structures such as linked lists and trees.
- It is used in lookup tables by computer.
