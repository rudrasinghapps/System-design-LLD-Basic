package SystemDesign.iterator_design_pattern;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T> {

   private Node head = null;
   private Node tail = null;
   private int size = 0;

  private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIteratro(head);
    }

    private class LinkedListIteratro implements Iterator<T>{
        Node temp;
        LinkedListIteratro(Node node){
            this.temp = node;
        }
        @Override
        public boolean hasNext() {
            return temp != null;
        }
        @Override
        public T next() {
            if(!hasNext()) throw new NoSuchElementException();
            T data = temp.data;
            temp  = temp.next;
            return data;
        }
    }

    public void addLast(T data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int size() {
        return size;
    }


}
