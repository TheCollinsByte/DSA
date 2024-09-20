<div align="center">

<h1><a href="https://github.com/TheCollinsByte/DSA">Data Structures and Algorithms (DSA)</a></h1>

<a href="https://github.com/TheCollinsByte/DSA/blob/main/LICENSE">
<img alt="License" src="https://img.shields.io/github/license/TheCollinsByte/DSA?style=flat&color=eee&label="> </a>

<a href="https://github.com/TheCollinsByte/DSA/graphs/contributors">
<img alt="People" src="https://img.shields.io/github/contributors/TheCollinsByte/DSA?style=flat&color=ffaaf2&label=People"> </a>

<a href="https://github.com/TheCollinsByte/DSA/stargazers">
<img alt="Stars" src="https://img.shields.io/github/stars/TheCollinsByte/DSA?style=flat&color=98c379&label=Stars"> </a>

<a href="https://github.com/TheCollinsByte/DSA/network/members">
<img alt="Forks" src="https://img.shields.io/github/forks/TheCollinsByte/DSA?style=flat&color=66a8e0&label=Forks"> </a>

<a href="https://github.com/TheCollinsByte/DSA/watchers">
<img alt="Watches" src="https://img.shields.io/github/watchers/TheCollinsByte/DSA?style=flat&color=f5d08b&label=Watches"> </a>

<a href="https://github.com/TheCollinsByte/DSA/pulse">
<img alt="Last Updated" src="https://img.shields.io/github/last-commit/TheCollinsByte/DSA?style=flat&color=e06c75&label="> </a>

</div>

## Description

LeetCodeJ is an open-source project where I solve LeetCode challenges using Java. The aim is to provide efficient and well-documented solutions to a variety of coding problems.

- [Installation](#installation)
- [Usage](#usage)
- [Solutions](#solutions)
- [Contributing](#contributing)
- [License](#license)

# Data Structures

A data strucuture is the mathematical or logical model of an organization of data.

## Classification of Data Structure

- <b>Linear Data Structure: </b>Data strucuture in which data elements are arranged sequentially or linearly, where each element is attached to its previous and next adjacent elements. Example: Array, Stack, Queue, Linked List etc.
- <b>Static Data Structure: </b>has a fixed memory size. It is easier to access the elements in a static data structure. Example: Array.
- <b>Dynamic Data Structure: </b>In dynamic data strucuture, the size is not fixed. it can be randomly updated during the runtime which may be considered efficient concerning the memory (space) complexity of the code. Example: Queue, Stack etc
- <b>Non-Linear Data Structure: </b>Is where data elements are not placed sequentially or linearly. We can't traverse all the elements in a single run only. Example: Trees and Graphs.

## Types of Data Structures

- <b>Arrays: </b>An array is a collection of elements of the same type placed in contiguous memory locations.
- <b>Linked List: </b>It is a linear data strucuture, in which the elements are not stored at contiguous memory locations and the elements are linked with each other.
- <b>Stacks: </b>Follow LIFO (Last In First Out) principle, In this, the last element in the stack will be removed first.
- <b>Queues: </b>Follow FIFO (First In First Out) principle, In this, the first element stored is removed first.
- <b>Hash Tables (Hash Maps/Sets): </b>This is a type of data strucuture that store values which have keys related to each of them.
- <b>Trees: </b>It is a data strucuture in which data is organized hierarchically and linked together. Some Examples are the Binary Search tree, Binary tree, Splay tree, AVL tree etc.
- <b>Heaps: </b>It is specialized tree-based data strucuture, also called Binary heap in which the tree is a complete binary tree and the data is stored.
- <b>Graphs: </b>It consists of a set of nodes and edges connecting each other.
- <b>Tries (Prefix Tree): </b>a tries is a specialized tree-based data strucuture used to store a dynamic set of strings, where the keys are usually strings. It is often used for tasks such as autocomplete or searching for words in a dictionary. Tries enable efficient retrieval of strings based on their prefixes.
- <b>Union-Find (Disjoint Set Union (DSU)): </b>this data strucuture keeps track of a set of elements partitioned into disjoint subsets. It supports two operations: find(determines which subset a particular element is in) and Union (merges two subsets). It is often used in network connectivity and Kruskal's algorithm for finding minimum spanning trees.


# Algorithm

- An algorithm is a well-defined sets of instructions designed that are used to solve problems or perform a task.

## Types of Algorithms

- <b>Recursion: </b>A recursive algorithm is based on recursion. In this case, a problem is broken into several sub-parts and called the same function again and again.
- <b>Dynamic Programming Algorithm: </b>This algorithm uses the concept of using the already found solution to avoid repetitive calculation of the same part of the problem. It divides the problem into smaller overlapping subproblem and solves them.
- <b>Greedy Algorithms: </b>In this type of algorithm, the solution is built part by part. The solution for the next part is built based on the immediate benefit of the next part. The one solution that gives the most benefit will be chosen as the solution of the next part.
- <b>Backtracking: </b>The backtracking algorithm builds the solution by searching among all possible solutions. Using this algorithm, we keep on building the solution following criteria. Whenever a solution fails we trace back to the failure point build on the next solution and continue this process till we find the solution or all possible solutions are looked after.
- <b>Brute Force Algorithm: </b>It's the simplest approach to a problem. A brute force algorithm is the first approach that comes to finding when we see a problem.
- <b>Searching Algorithm: </b>are the ones that are used for searching elements or groups of elements from a particular data Structure. They can be of different types based on their approach or the data Structure in which the element should be found. They can be of different types based on their approach or the data Structure in which the element should be found.
- <b>Hashing Algorithm: </b>works similarly to the searching algorithm. But they contain an index with a key ID. In hashing, a key is assigned to a specific data.
- <b>Sorting Algorithm: </b>is arranging a group of data in a particular manner according to the requirment. Generally sorting algorithms are used to sort groups of data in an increasing or decreasing manner.
- <b>Divide and Conquer Algorithm: </b>This algorithm breaks a problem into sub-problems, solves a single sub-problem, and merges the solutions to get the final solution. It Consists of the following three steps: Divide, Solve and Combine.
- <b>Randomized Algorithms: </b>In the randomized algorithm, we use a random number so it gives immediate benefit. The random number helps in deciding the expected outcome.
- <b>Pattern Searching: </b>These algorithm are useed to find a pattern (substring) within a larger text (string). They help locate the position of a pattern in a given string. Common examples include the Knuth-Morris-Pratt (KMP) and Boyer-Moore algorithms.
- <b>Geometric Algorithms: </b>These algorithm solve geometric problems like finding the convex hull, intersections of lines, and nearest neighbors. They deal with points, lines and polygons in 2D or 3D Space.
- <b>Mathematical Algorithms: </b>These are algorithms that solve mathematical problems such as calculating prime numbers, performing matrix operations or solving linear equations. Examples include algorithms for number theory, combinatorics and algebraic problems like the Euclidean algorithm for finding the greatest common divisor (GCD).
- <b>Bit Algorithms: </b>Bit manipulation algorithms perform operations at the bit level such as flipping, setting or shifting bits. They are efficient in optimizing space and speed for tasks like counting bits or performing XOR operations. Common bit algorithms include bitwise AND, OR and XOR operations.
- <b>Graph Algorithms: </b>These algorithms deal with problems related to graphs, which are structures made up of vertices (nodes) connected by edges. Graph algorithms include finding the shortest path (Dijkstra's, Bellman-Ford), detecting cycles, or finding minimum spanning trees (Kruskal's, Prim's).
- <b>Branch and Bound: </b>This is an optimization algorithm used for solving combinatorial problems, such as the Traveling Salesman Problem or Knapsack Problem. The algorithm explores all possible solutions but "bounds" parts of the search space that cannot lead to an optimal solution to avoid unnecessary exploration.

## Analysis of Algorithms:

Analysis of algorithm deals in finding the best algorithm which runs fast and takes in less memory.

- Time Complexity
- Space Complexity

### Time Complexity

- Amount of time taken by algorithm to run.
- The input processed by an algorithm helps in determining the time Complexity.

### Space Complexity

- Amount of memory or space taken by algorithm to run.
- The memory required to process the input by an algorithm helps in determining the space complexity.

## Asymptotic Analysis of an Algorithm

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

There are three notations for performing runtime analysis of an algorithm

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
