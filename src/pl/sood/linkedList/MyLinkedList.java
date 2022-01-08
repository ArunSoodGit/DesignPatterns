package pl.sood.linkedList;

import java.util.Collection;

public class MyLinkedList <E> implements NodeList <E>{

    private ListItem <E> root = null;

    public MyLinkedList() {

    }

    @Override
    public ListItem<E> getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(E value) {
        Node<E> node = new Node<>(value);
        if (this.root == null) {
            //The list was empty, so this item becomes the head of the list
            this.root = node;
            return true;
        }
        ListItem<E> currentItem = this.root;
        while (currentItem != null) {
            if (currentItem.next() != null) {
                currentItem = currentItem.next();
            } else {
                //there is no next, so insert at end of list
                currentItem.setNext(node);
                node.setPrevious(currentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(E value) {
        Node<E> item = new Node<E>(value);
        if (value != null) {
            System.out.println("Deleting item " + item.getValue());
            ListItem<E> currentItem = this.root;
            while (currentItem != null) {
                if (!currentItem.getValue().equals(value)) {
                    currentItem = currentItem.next();
                } else {
                    if (currentItem == this.root) {
                        this.root = currentItem.next();
                        currentItem = currentItem.next();
                    } else {
                        //delete value from list
                        currentItem.previous().setNext(currentItem.next());
                        currentItem.next().setPrevious(currentItem.previous());
                        return true;
                    }

                }
            }
        }
        return false;
    }

    @Override
    public void printList() {
        ListItem<E> currentItem = root;
        StringBuilder output = new StringBuilder();
        output.append("[");
        while (currentItem != null) {
            output.append(currentItem.getValue()).append(", ");
            currentItem = currentItem.next();
        }
        System.out.print(output.append("]\n"));

    }
}
