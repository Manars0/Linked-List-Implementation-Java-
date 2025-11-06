# Linked List Implementation (Java)

A simple **generic Linked List** implementation in Java.  
This project demonstrates how to create and manipulate a singly linked list using classes, objects, and generics.

> This project showcases core concepts of **Data Structures** and **Object-Oriented Programming (OOP)**.

## Features
- Generic implementation (`<T>`) that works with any data type  
- Add elements:
  - At the beginning  
  - At the end  
  - At a specific position  
- Remove first or last element  
- Retrieve data by position  
- Search for an element  
- Print all elements  
- Clear the entire list  
- Check if the list is empty and get its size  

## Technologies Used
- Java (JDK 17 or later)  
- OOP Concepts (Encapsulation, Generics)  
- Data Structures (Linked List)

## Class Overview
### `Node<T>`
Represents a single node in the linked list.
```java
public class Node<T> {
    public T Data;
    public Node<T> next;

    public Node(T Da) {
        Data = Da;
        next = null;
    }
}
```
**Example Test** (from TestLinkedList.java)

This example demonstrates how to create and test the custom LinkedList class.
It shows how to add, print, and search elements in the list.
```
package linkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> Names = new LinkedList<String>();
        Names.addLast("Manar");
        Names.addLast("Fay");
        Names.addLast("Haya");
        
        // Print the list
        Names.printList();
        
        // Display size
        System.out.println("List size: " + Names.size());
        
        // Search for a name
        System.out.println("Is 'nouf' in the list? " + Names.search("nouf"));
    }
}
```
**Example Console Output:**
```
Manar
Fay
Haya
List size: 3
Is 'nouf' in the list? false
```
## Author
**Manar Salem**  
Programming and Database Student  
[https://github.com/Manars](https://github.com/Manars)
