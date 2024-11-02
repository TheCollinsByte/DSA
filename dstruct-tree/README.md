# Tree

<b>Tree Data Strucutre</b> is a non-linear data strcuture in which a collection of elements known as nodes are connected to each other via edges such that there exists exactly one path between any two nodes.
<br/>
A <b>tree data structure</b> is a hierarchical structure that is used to represent and organize data in a way that is easy to navigate and search. It is a collection of nodes that are connected by edges and has a hierarchical relationship between the nodes.
<br/>
The topmost node of the tree is called the root, and the nodes below are called the child nodes. Each node can have multiple child nodes, and these child nodes can also have their own child nodes, forming a recursive structure.


## Terminologies In Tree Data Structure

* <b>Node:</b> Node is the main component of a tree that stores the data along with the links to other nodes.
* <b>Edge:</b> Edge (also called branch) connects two nodes of a tree. A node can have more than one edge.
* <b>Parent Node:</b> The node which is a predecessor of a node is called the parent node of the node. {B} is the parent node of {D, E}.
* <b>Child Node:</b> The node which is the immediate successor of a node is called the child node of that node. Example: {D, E} is the child node of {B}.
* <b>Root Node:</b> The topmost node of a tree or the node which does not have any parent node. {A} is the root node of the tree. A non-empty tree must contain exactly one root node and exactly one path from the root to all other nodes of the tree.
* <b>Leaf Node or External Node:</b> The nodes which do not have any child nodes. {I, J, K, F, G, H} are the leaf nodes of the tree.
* <b>Internal node(Non-Leaf node):</b> A node with at least one child is called an internal node.
* <b>Ancestor of a Node:</b> Any predecessor nodes on the path of the root to that node are called Ancestors of the node. {A, B} are the ancestor nodes of the node {E}.
* <b>Descendant:</b> A node x is a descendant of another node y if and only if y is an ancestor of x.
* <b>Sibling:</b> Children of the same parent node are called siblings.{D,E} are called siblings.
* <b>Cousins:</b> The nodes belonging to the same level with different parent nodes.
* <b>Neighbor of a Node:</b> Parent or child nodes of that node are called neighbors of the node.
* <b>Degree:</b> Degree of a node is defined as the number of children of that node. The degree of the tree is the highest degree of a node among all the nodes.
* <b>Path:</b> The nodes in the tree has to be reachable from other nodes through a unique sequence of edges, The number of edges in a path is called the length of the path.
* <b>Level of a node:</b> The count of edges on the path from the root node to that node. The root node has level 0.
* <b>Subtree:</b> Any node of the tree along with its descendant.


## Types of Tree Data Structure

* <b>Binary Tree:</b> In a binary tree, each node can have a maximum of two children linked to it. Some common types of binary tree include full binary tree, complete binary trees, balanced binary tree, and degenerate or pathological binary trees.
* <b>Ternary Tree:</b> A Ternary Tree is a tree data structure in which each node has at most three child nodes, usually distinguished as "left", "mid" and "right".
* <b>N-ary Tree or Generic Tree:</b> Generic trees are a collection of nodes where each node is a data structure that consists of records and a list of references to its children (duplicate references are not allowed). Unlike the linked list, each node stores the address of multiple nodes.
* <b>Binary Search Tree(BST):</b> A binary tree with the property that the left child contains values less than the parent, and the right child contains values greater than the parent.
* <b>Balanced Tree (eg: AVL, Red-Black Tree):</b> Trees that maintain their height close to the minimum possible height to improve operations like search, insert, delete.
* <b>Heap (Min-Heap/Max-Heap):</b> A binary tree where each parent node is either greater than or equal to (max-heap) or less than or equal to (min-heap) its children.
* <b>Trie:</b> A tree used for searching strings or sequences.


## Advantages of Tree

* <b>Efficient Searching:</b> Trees are particularly efficient for searching and retrieving data. The time complexity of searching in a tree is typically O(log n) where n is the number of nodes in the tree. which means that it's very fast even for very large data sets.
* <b>Flexible Size:</b> Trees can grow or shrink dynamically depending on the number of nodes that are added or removed. This makes them particularly useful for applications where the data size may change over time.
* <b>Easy to Traverse:</b> Traversing a tree is simple operation, and it can be done in several different ways depending on the requirements of the application. This makes it easy to retrieve and process data from a tree structure.
* <b>Easy to maintain:</b> Trees are easy to maintain because they enforce a strict hierarchy and relationship between nodes. This makes it easy to add, remove or modify nodes without affecting the rest of the tree structure.
* <b>Natural Organization:</b> Trees have a natural hierarchical organization that can be used to represent many types of relationship. This makes them particularly useful for representing things like file systems, organizational structures and taxonomies.
* <b>Fast insertion and deletion:</b> Inserting and deleting nodes in a tree can be done in O(log n) time, which means it's very fast even for very large trees.


## Disadvantages of Tree

* <b>Memory overhead:</b>  Trees can require a significant amount of memory to store, especially if they are very large. This can be a problem for applications that have limited memory resources.
* <b>Imbalanced trees:</b> If a tree is not balanced, it can result in uneven search times. This can be a problem in applications where speed is critical.
* <b>Complexity:</b> Trees can be complex data structure, and they can be difficult to understand and implement correctly. This can be a problem for developers who are not familiar with them.
* <b>Limited flexibility:</b> While trees are flexible in terms of size and structure, they are not as flexible as other data structures like hash tables. This can be a problem in applications where the data size may change frequently.
* <b>Inefficient for certain operations:</b> While trees are very efficient for searching and retrieving data, they are not as efficient for other operations like sorting or grouping. For these types of operations, other data structures may be more appropriate.


## Applications of Tree Data Strcuture

* <b>File System:</b> This allows for efficient navigation and organization of files.
* <b>XML Parsing:</b> Trees are used to parse and process XML documents. An XML document can be thought of as a tree, with elements as nodes and attributes as properties of the nodes.
* <b>Data Compression:</b> <b>Huffman coding</b> is a popular technique for data compression that involves constructing a binary tree where the leaves represent characters and their frequency of occurrence. The resulting tree is used to encode the data in a way that minimizes the amount of storage required.
* <b>Compiler Design:</b> In compiler design, a syntax tree is used to represent the structure of a program.
* <b>Database Indexing:</b> B-trees and other tree structure are used in database indexing to efficiently search for and retrieve data.
* <b>Artificial Intelligence:</b> Decision trees are often used in artificial intelligence to make decisions based on a series of criteria.
