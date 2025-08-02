package DS.LinkedList;

import javax.sound.sampled.Line;
import java.util.Iterator;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

class customException extends Exception {
    String message;

    public customException(String message) {
        super(message);
    }
}

abstract class customizeLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int size = 0;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    // adding element at the end
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // adding element at the beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // removing element at the beginning
    public T remove() {
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    //check bound
    public void checkBound(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Array is out of bound");
        }
    }

    //get at index value
    public T get(int index) {
        checkBound(index);
        Node<T> current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int size() {
        return size;
    }

    public void display() {
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

public class Generics<T> {
    public static void main(String[] args) {
        customizeLinkedList<String> ls = new customizeLinkedList<String>() {};

        ls.add("meet");
        ls.addFirst("yo yo");

        ls.remove();
        System.out.println(ls);

        ls.display();
        ls.addFirst("lakshya");
        ls.display();
    }
}
