package SystemDesign.class8;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {


    @Override
    public Iterator<T> iterator() {
        return new MyIterator(head);
    }

    class MyIterator implements Iterator<T>{
         Node temp ;
         MyIterator(Node head){
             this.temp = head;
         }

        @Override
        public boolean hasNext() {
           return temp != null;
        }

        @Override
        public T next() {
            T data = temp.data;
            temp = temp.next;
            return data;
        }
    }

    class Node{
        T data;
        Node next;

        Node(T data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    int size =  0;

    public void addLast(T data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            size = 1;
        }else{
            tail.next = node;
            tail = node;
            size ++;
        }
    }

    public  int size(){
        return size;
    }


}
