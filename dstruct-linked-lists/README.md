# Linked Lists

A <b>Linked List</b> is a linear data structure that consists of a series of nodes connected by pointers (in C or C++) or references (in Java, Python and JavaScript).
Each node contains data and a pointer/reference to the next node in the list.
Unlike arrays, Linked List allow for efficient insertion or removal of elements from any position in the list, as the nodes are not stored contiguously in memory.

## Characteristics of Linked List:

* Dynamic: Linked List can be easily resized by adding or removing nodes.
* Non-Contiguous: Nodes are stored in random memory locations and connected by pointers.
* Sequential access: Nodes can only be accessed sequentially, starting from the head to the list.

## Operations on Linked List:

* Creation: Creating a new linked list or adding a new node to an existing list.
* Traversal: Iterating through the list and accessing each node.
* Insertion: Adding a new node at a specific position in the list.
* Deletion: Removing a node from the list.
* Search: Find a node with a specific value in the list.

## Types of Linked List:

* Singly Linked List: Each node points to the next node in the list.
* Doubly Linked List: Each node points to both the next and previous node in the list.

* Circular Linked List: The Last node points back to the first node, forming a circular loop.
* Circular Singly Linked List: A data structure where each node has a link to the next node, and the last node in the list points back to the first node.
* Circular Doubly Linked List: A data structure where each node has a link to the next and previous node, and the last node in the list points back to the first node.

* Header Linked List: A type of linked list where the first node, called the <b>header node,</b> doesn't store actual data. Instead, it  serves as a starting point for the list and helps manage operations like insertion, deletion or traversal. The header node simplifies these operations by providing a consistent reference point, even if the list is empty.

## Applications of Linked List:

- Memory Management
- Maintaining ordered data
- Implementing queues and stacks
- Representing graphs and trees
- Allocating and deallocating memory dynamically
