package day54_Collections_Queue_Set.Queue;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Integer>arrayDeque = new ArrayDeque<>();

        arrayDeque.add(20);
        arrayDeque.add(10);
        arrayDeque.add(15);
        arrayDeque.add(5);
        arrayDeque.add(15); // duplicate izin verir

        System.out.println("arrayDeque = " + arrayDeque);

        // Listedeki ilk elemanı seçebiliyoruz
        System.out.println("arrayDeque.peekFirst() = " + arrayDeque.peekFirst());
        System.out.println("arrayDeque = " + arrayDeque);

        //Listedeki son elemanı seçebiliyoruz
        System.out.println("arrayDeque.peekLast() = " + arrayDeque.peekLast());
        System.out.println("arrayDeque = " + arrayDeque);

        //İlk elemanı getirme ve silerek listeyi yenileme
        System.out.println("arrayDeque.pollFirst() = " + arrayDeque.pollFirst());
        System.out.println("arrayDeque = " + arrayDeque);

        // Son elemanı getirme ve silerek listeyi yenileme
        System.out.println("arrayDeque.pollLast() = " + arrayDeque.pollLast());
        System.out.println("arrayDeque = " + arrayDeque);

        // İlk sıraya eleman ekleme
        arrayDeque.addFirst(30);
        System.out.println("arrayDeque = " + arrayDeque);

        // Son sıraya eleman ekleme
        arrayDeque.addLast(26);
        System.out.println("arrayDeque = " + arrayDeque);

        // clears the list
        arrayDeque.clear();
        System.out.println("arrayDeque = " + arrayDeque);

    }
}
