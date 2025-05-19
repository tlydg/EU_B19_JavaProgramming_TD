package day53_Collections_List.List_LinkedList;

import java.util.LinkedList;

public class ListLinkedListRemoveFirstElm {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked  list: " + linkedList);

        //pop() is coming from Stack implementation
        //pop() and remove() both invoked removeFirst() method
        System.out.println("Removed element( pop() ): " + linkedList.pop());
        System.out.println("Linked list after pop operation: " + linkedList);

        System.out.println("Removed element( remove() ):  = " + linkedList.remove());
        System.out.println("Linked list after remove operation: " + linkedList);
    }
}
