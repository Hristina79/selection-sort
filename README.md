## Selection Sort Implementation in Java
This repository contains an implementation of the Selection Sort algorithm in Java.

- **Selection sort**: Repeatedly finds the smallest element from the unsorted path and moves it to the front (or to the left). In this case it sorts the elements together single linked list.

### Project Structure

- MyQueue.java
  
  Interface defining the basic queue operations (`enqueue`, `dequeue`, `peek`, etc.).

- SingleLinkedList.java
  
  Implements MyQueue<T> using a single linked list. Provides the queue functionality used by the sorting algorithm.

- SelectionSort.java
  
  Implements the selection sort algorithm specifically made to work with SingleLinkedList<T>. It supports custom sorting using a Comparator, or default to natural ordering.

- Main.java
  
  Contains an example where a SingleLinkedList is filled with data, sorted using SelectionSort, and results are printed.

- SingleLinkedListTest.java
  
  Provides unit tests to ensure correctness on SingleLinkedList implementation.
  
### How It Works

1. The queue is populated with elements using the `enqueue` method.
2. `SelectionSort.sort()` is called with the queue and an optional `Comparator`.
3. The linked list is traversed and sorted **in-place** using selection sort logic.
4. The sorted queue is printed.
