package pl.sood.linkedList;

public interface NodeList<E> {
    ListItem<E> getRoot();
    boolean addItem(E value);
    boolean removeItem(E value);
    void printList();
}
