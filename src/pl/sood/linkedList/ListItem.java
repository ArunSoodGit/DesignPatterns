package pl.sood.linkedList;

public abstract class ListItem <E> {
    protected ListItem <E> rightLink = null;
    protected ListItem <E> leftLink = null;
    protected E value;

    public ListItem(E value) {
        this.value = value;
    }

    abstract ListItem<E> next();

    abstract ListItem<E> setNext(ListItem<E> item);

    abstract ListItem<E> previous();

    abstract ListItem<E> setPrevious(ListItem<E> item);

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
