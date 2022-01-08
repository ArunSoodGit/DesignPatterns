package pl.sood.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this.elementData = new Object[CAPACITY];
    }

    public void add(E element) {
        if (this.size == this.elementData.length)
            this.elementData = growArray();
        this.elementData[this.size] = element;
        this.size = this.size + 1;
    }



    private Object[] growArray() {
        return elementData = Arrays.copyOf(elementData,
                newCapacity(this.size + 1));
    }

    private int newCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (int)(oldCapacity * 1.5);
        if (newCapacity - minCapacity <= 0) {
            if (elementData == EMPTY_ELEMENT_DATA)
                return Math.max(CAPACITY, minCapacity);
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return newCapacity;

    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        output.append("[");
        if (elementData != null) {
            output.append(Arrays.toString(elementData)).append(", ");
        }
        System.out.print(output.append("]\n"));

    }
}
