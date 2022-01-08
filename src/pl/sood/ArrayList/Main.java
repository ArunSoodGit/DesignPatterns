package pl.sood.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        MyArrayList<String> stringMyArrayList = new MyArrayList<>();

        stringMyArrayList.add("test");
        stringMyArrayList.add("ewr");
        stringMyArrayList.add("test");
        stringMyArrayList.add("432");
        stringMyArrayList.add("test");
        stringMyArrayList.add("423");
        stringMyArrayList.add("ewr");
        stringMyArrayList.add("rwe");
        stringMyArrayList.add("test");
        stringMyArrayList.add("fsd");
        stringMyArrayList.add("test");
        stringMyArrayList.add("test");
        stringMyArrayList.add("das");
        stringMyArrayList.add("test");
        stringMyArrayList.add("test");
        stringMyArrayList.add("tesadst");
        stringMyArrayList.add("test");
        stringMyArrayList.add("sad");
        stringMyArrayList.add("test");

        stringMyArrayList.printList();
    }
}
