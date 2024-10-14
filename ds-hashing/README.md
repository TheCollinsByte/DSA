# Hashing

Hashing is a technique used in data structures to store and retrieve data efficiently. It involves using a <b>hash function</b> to map data items to a fixed-size array which is called a <b>hash table.</b> Below are basic terminologies in hashing.

- <b>Hash Function:</b> You provide your data items into the hash function.
- <b>Hash Code:</b> The hash function crunches the data and give a unique hash code. This hash code is typically integer value that can be used an index.
- <b>Hash Table:</b> The hash code then points you to a specific location within the hash table.

## Hash Table in Data Structure

A <b>hash table</b> is also referred as a hash map (Key value pairs) or a hash set (only keys). It uses a <b>hash function</b> to map <b>keys</b> to a fixed-size array, called a <b>hash table.</b> This allows in faster <b>search</b>, <b>insertion</b> and <b>deletion</b> operations.

## Hash Function

The <b>hash function</b> is a function that takes a <b>key</b> and returns an <b>index</b> into the <b>hash table</b>. The goal of a hash function is to distribute keys evenly across the hash table, minimizing collisions (when two keys map to the same index).

- Common hash functions include:
* <b>Division Method:</b> Key % Hash Table Size
* <b>Multiplication Method:</b> (Key * Constant) % Hash Table Size
* <b>Universal Hashing:</b> A family of hash functions that produce different hash codes for the same key.


## What is Hash Collision?

A hash Collision occurs when two different keys map to the same index in a hash table. This can happen even with a good hash function, especially if the hash table is full or the keys are similar.

- Causes of Hash Collisions:
* <b>Poor Hash Function:</b> A hash function that does not distribute keys evenly across the hash table can lead to more collisions.
* <b>High Load Factor:</b> A high load factor (ration of keys to hash table size) increases the probability of collisions.
* <b>Similar Keys:</b> Keys that similar in value or structure are more likely to collide.


## Collision Resolution Techniques
There are two types of collision resolution techniques in hashing:

1. Open Addressing

* Linear Probing: Search for an empty slot sequentially.
* Quadratic Probing: Search for an empty slot using a quadratic function.

2. Closed Addressing

* Chaining: Store colliding keys in linked list or binary search tree at each index
* Cuckoo Hashing: Use multiple hash functions to distribute keys

## Applications of Hashing
Hash tables are used wherever we have a combination of search, insert and/or delete operations.

- <b>Caching:</b> Storing frequently accessed data for faster retrieval. For example browser caches, we can use URL as keys and find the local storage of the URL.
- <b>Network Routing:</b> Determining the best path for data packets.
- <b>Dictionaries:</b> To implement a dictionary so that we can quickly search a word.
- <b>Databases:</b> Hashing is used in <b>database indexing</b>. There are two popular ways to implement indexing, search trees(B or B+ Tree) and hashing.
- <b>Symbol Tables:</b> Mapping identifiers to their values in programming languages.
- <b>Cryptography:</b> When we create a password on a website, they typically store it after applying a hash function rather than plain text.
- <b>Associative Arrays:</b> Associative arrays are nothing but hash tables only. Common SQL library functions allow you retrieve data as associative arrays so that the retrieved data in RAM can be quickly searched for a key.
