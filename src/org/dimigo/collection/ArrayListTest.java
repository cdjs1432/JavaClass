package org.dimigo.collection;

import org.dimigo.abstractclass.Dog;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("나자바");
        list.add(100);
        list.add(new Dog());

        // 제네릭(Generic)
        List<String> list2 = new ArrayList<>();
        list2.add("사과");
        list2.add("배");
        list2.add("딸기");
        list2.add("딸기");
        list2.add(1, "포도");
        System.out.println(list2.get(list2.size() - 1));
        list2.remove(1);
        printList(list2);
        list2.remove("딸기");
        printList(list2);
        list2.clear();


    }

    private static void printList(List<String> list2) {
        for (String s : list2) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }

}
