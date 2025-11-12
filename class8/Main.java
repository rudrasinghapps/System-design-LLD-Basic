package SystemDesign.class8;

import java.util.Iterator;

public class Main {
    static void main() {
        MyLinkedList<Integer> list = new MyLinkedList();
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

        MyLinkedList<String> lists = new MyLinkedList();
        lists.addLast("A");
        lists.addLast("B");
        lists.addLast("C");
        lists.addLast("D");
        lists.addLast("E");

        for(int e:list) System.out.println(e);
        for(String e:lists) System.out.print(e+" ");
        System.out.println();

        Iterator<String> it = lists.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
