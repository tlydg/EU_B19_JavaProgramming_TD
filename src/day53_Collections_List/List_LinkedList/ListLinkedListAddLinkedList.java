package day53_Collections_List.List_LinkedList;

import java.util.LinkedList;

public class ListLinkedListAddLinkedList {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        // use add() method to add(append) values in the linked list - if the element added successfully returns true
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");

        // print original list
        System.out.println("Original linked list:" + linkedList);

        // create a new collection and add some elements

        LinkedList<String> new_linkedList = new LinkedList<>();
        new_linkedList.add("White");
        new_linkedList.add("Pink");

        // Add the collection in the index position of the existing linked list
        linkedList.addAll(1, new_linkedList);

        // print the new list
        System.out.println("LinkedList:" + linkedList);
    }
}
