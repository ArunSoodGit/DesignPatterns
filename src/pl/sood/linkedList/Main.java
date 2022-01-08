package pl.sood.linkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String>stringList =  new LinkedList<>();
//        stringList.add("a");
//        stringList.add("a");
//        stringList.add("v");
//        stringList.add("c");
//        stringList.remove("a");
//
//        System.out.println(stringList);

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addItem("BC");
        myLinkedList.addItem("A");
        myLinkedList.addItem("D");
        myLinkedList.addItem("G");
        myLinkedList.addItem("A");
//        myLinkedList.addItem(1);
        myLinkedList.printList();

        myLinkedList.removeItem("A");
        myLinkedList.removeItem("G");
        myLinkedList.removeItem("BC");
        myLinkedList.printList();

    }
}
