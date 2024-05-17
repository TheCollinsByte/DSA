# Data Structures

It's a way to organize data. After organizing data it becomes easy to process it.

## Types of Data Structures

- Linear: Arranged in sequensial manner: Array, Linked List, Stack and Queue
- Non-Linear: They are not sequensial manner, they're multilevel: Tree and Graph

# Algorithm

- An algorithm is a set of instructions to perform a task or to solve a given problem.


## Analysis of Algorithm

- Analysis of algorithm deals in finding the best algorithm which runs fast and takes in less memory.
    * Time Complexity
    * Space Complexity

### Time Complexity

- Amount of time taken by algorithm to run.
- The input processed by an algorithm helps in determining the time Complexity.

### Space Complexity

- Amount of memory or space taken by algorithm to run.
- The memory required to process the input by an algorithm helps in determining the space complexity.

### Asymptotic Analysis of an Algorithm

- Asymptotic analysis helps in evaluating performance of an algorithm in terms of input size and its increase.
- Using asymptotic analysis we don't measure actual running time of algorithm.
- It helps in determining how time and space taken by algorithm increases with input size.

### Asymptotic Notations

- Asymptotic Notations are the mathematical tools used to describe the running time of an algorithm in terms or input size.
- Example - Performance of car in 1 liter of petrol
 
```markdown
Highway (Min Traffic) - 25 km/litre
City (Max Traffic) - 15 km/litre
City + Highway (average Traffic) - 20 km/litre
```

Asymptotic Notations helps us in determine:
* Best Case
* Average Case
* Worst Case

### Types of Asymptotic Notations

- There are three notations for performing runtime analysis of an algorithm

* Omega (Ω) Notation
* Big O (O) Notation
* Theta (Θ) Notation


# Omega (Ω) Notation

- The formal way to express the lower bound of an algorithm's running time.
- Lower bound means for any given input this notation determines best amount of time an algorithm can take to complete.

# Big O (O) Notation

- The formal way to express the upper bound of an algorithm running time.
- Upper bound means for any given input this notation determines longest amount of time an algorithm can take to complete.
- Worst case analysis

## Rules of Big O (O) Notation

- It's a single processor
- It performs sequential Execution of Statements
- Assignment operation takes 1 unit of time. eg: int x = 5 -> 1 Unit of Time
- Return Statement takes in 1 unit of time. eg: return x -> 1 unit of Time
- Arithmetic operation takes 1 unit of time. eg: x + y -> 1 unit of Time
- Logical operation takes 1 unit of time. eg: x && y -> 1 unit of Time
- Other small/single operations takes 1 unit of time.
- Drop lower order terms. eg: Polynomial Equation: T = n<sup>2</sup> + 3n + 1 => O(n<sup>2</sup>)
- Drop constant multipliers. eg: Polynomial Equation: T = 3n<sup>2</sup> + 6n + 1 => O(n<sup>2</sup>)

# Theta (Θ) Notation

- The formal way to express both the upper and lower bound of an algorithm running time.
- By Lower and Upper bound means for any given input this notation determines average amount of time an algorithm can take to complete.
- Average Case analysis


# What is an Array?

- It's a collection (box) of data elements of specified type.
- All data holding partitions have contiguous memory locations.
- Each partition has two neighbors except first and last one.
- Size of array is fixed and cannot be modified once it is created.
- Being adjacent each partition is indexed and can be determined by its position.
- Index start at 0 and for (one dimensional array) ends at length - 1.

# What is a Singly Linked List?

- A singly linked list is a data structure that consists of a sequence of elements called nodes. Each node contains two parts: data and a reference (or pointer) to the next node in the sequence. The first node is called the head, and the last node's reference points to null, indicating the end of the list.

# What is a Doubly Linked List?

- A doubly linked list is similar to a singly linked list, but with an extra pointer in each node, allowing traversal in both forward and backward directions. In addition to having a reference to the next node (usually called next), each node in a doubly linked list also has a reference to the previous node (usually called prev).
 
# What is a Circular Singly Linked List?

- A circular singly linked list is a variation of a singly linked list where the last node's reference doesn't point to null but instead points back to the first node, forming a circular structure.
- Instead of head, We keep track of last node in Circular Singly List