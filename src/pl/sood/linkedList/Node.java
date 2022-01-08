package pl.sood.linkedList;

public class Node<E> extends ListItem<E> {
    public Node(E value) {
        super(value);
    }

    @Override
    ListItem<E> next() {
        return this.rightLink;
    }

    @Override
    ListItem<E> setNext(ListItem<E> item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem<E> previous() {
        return this.leftLink;
    }

    @Override
    ListItem<E> setPrevious(ListItem<E> item) {
        this.leftLink = item;
        return leftLink;
    }
}
