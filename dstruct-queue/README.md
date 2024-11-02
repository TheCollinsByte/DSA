# Queue

A <b>Queue Data Structure</b> is a linear data structure that is open at both ends the operations are performed in First In First Out (FIFO) order.

We define a queue to be a list in which all additions to the list are made at one end (back of the queue), and all deletions from the list are made at the other end(front of the queue).  The element which is first pushed into the order, the delete operation is first performed on that.

## FIFO Principle of Queue Data Structure:

- A Queue is like a line waiting to purchase tickets, where the first person in line is the first person served. (i.e. First Come First Serve).
- Position of the entry in a queue ready to be served, this is the first entry that will be removed from the queue is called the <b>front</b> of the queue (sometimes, <b>head</b> of the queue). Similarly, the position of the last entry in the queue, that is, the one most recently added is called <b>rear</b> (or the <b>tail</b>) of the queue.


## Types of Queue Data Structure

- <b>Simple Queue:</b> Simple Queue simply follow FIFO Strcuture. We can only insert the element at the back and remove the element from the front of the queue.
- <b>Double-Ended Queue (Dequeue):</b> In a double-ended queue the insertion and deletion opertions, both can be performed from both ends. They are of two types:
    - <b>Input Restricted Queue:</b> This is a simple queue. In this type of queue, the input can be taken from only one end but deletion can be done from any of the ends.
    - <b>Output Restricted Queue:</b> This is also a simple queue. In this type of queue, the input can be taken from both ends but deletion can be done from only one end.
- <b>Circular Queue:</b> This is a special type of queue where the last position is connected back to the first position. Here also the operations are performed in FIFO order.
- <b>Priority Queue:</b> A priority queue is a special queue where the elements are accessed based on the priority assigned to them. They are of two types:
    - <b>Ascending Priority Queue:</b> In Ascending Priority Queue, the elements are arranged in increasing order of their priority values. Element with smallest priority value is popped first.
    - <b>Descending Priority Queue:</b> In Descending Priority Queue, the elements are arranged in decreasing order of their priority values. Element with largest/highest priority value is popped first.


## Basic Operations in Queue Data Structure:

- Enqueue: Adds (or stores) an element to the end of the queue.
- Dequeue: Removal of elements from the queue.
- Peek or Front: Acquires the data element available at the front node of the queue without deleting it.
- Rear or Back: This operation returns the element at the rear end without removing it.
- isFull: Validate if the queue is full or not.
- isEmpty: Checks if the queue is empty.


## Complexity Analysis of Operations on Queue Data Structure:

| Operations | Time Complexity | Space Complexity |
| :--- | :--- | :--- |
| Enqueue | O(1) | O(1) |
| Dequeue | O(1) | O(1) |
| Front   | O(1) | O(1) |
| Back    | O(1) | O(1) |
| isEmpty | O(1) | O(1) |
| isFull  | O(1) | O(1) |


## Applications of Queue Data Structure:

- Queue can be used in Job scheduling like Printer Spooling.
- Queue can be used where we have a single resource and multiple consumers.
- In a network, a queue is used in devices such as router/switch and mail queue.
- Queue can be used in various algorithm techniques like Breadth First Search, Topological Sort etc.


## Advantages of Queue Data Structure:

- A large amount of Data can be managed efficiently with ease.
- Operations such as insertion and deletion can be performed with ease as it follows the first in first out rule.
- Queue are useful when a particular service is used by multiple consumers.
- Queue are fast in speed for data inter-process communication.
- Queue can be used in the implementation of other data structures.

## Disadvantages of Queue Data Structure:

- The operations such as insertion or deletion of elements from the middle are time consuming.
- Searching an element takes O(N) times.
- Maximum size of a queue must be defined prior in case of array implementation.
- The queue can be full or empty at any given time.
