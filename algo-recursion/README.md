# Recursion

<b>Recursion</b> is a programming technique where a function calls itself within its own definition. This allows a function to break down a problem into smaller subproblems, which are then solved recursively.

## How does recursion work?

<b>Recursion</b> works by creating a stack of function calls. When a function calls itself, a new instance of the function is created and pushed onto the stack. This process continues until a base case is reached, which is a condition that stops the recursion. Once the base case is reached, the function calls start popping off the stack and returning their results.


## What is a Recursive Algorithm?

A recursive algorithm is an algorithm that uses recursion to solve a problem. Recursive algorithms typically have two parts:

- <b>Base case:</b> Which is a condition that stops the recursion.
- <b>Recursive case:</b> Which is a call to the function itself with a smaller version of the problem.


## Types of Recursion

There are several different recursion types and terms. These include:

- <b>Direct recursion:</b> This is typified by the factorial implementation where the methods call itself.
- <b>In-Direct recursion:</b> This happens where one method, say method A, calls another method B, which then calls method A. This involves two or more methods that eventually create a circular call sequence.
- <b>Head recursion:</b> The recursive call is made at the beginning of the method.
- <b>Tail recursion:</b> The recursive call is the last statement.


## When to use Recursion?

Recursion is a powerful technique that can be used to solve a wide variety of problems. However, it is important to use recursion carefully, as it can lead to stack overflows if not used properly.

### Recursion should be used when:

- The problem can be broken down into smaller subproblems that can be solved recursively.
- The problem has a clear base case that stops the recursion.
- The recursive calls are tail recursive.


## Applications of Recursion Algorithms:
Here are some common applications of recursion:

* <b>Tree and Graph Traversal:</b> Depth-First Search (DFS) and breadth-first search (BFS)
* <b>Dynamic Programming:</b> Solving optimization problems by breaking them into smaller subproblems.
* <b>Divide and Conquer:</b> Solving problems by dividing them into smaller parts, solving each part recursively and combining the results
* <b>Backtracking:</b> Exploring all possible solutions to a problem by recursively trying different options
* <b>Combinatorics:</b> Counting or generating all possible combinations or permutations of a set.
