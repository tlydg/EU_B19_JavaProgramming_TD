package day54_Collections_Queue_Set.Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String>que = new LinkedList<>();
        que.add("Cemil");
        que.add("Ahmet");
        que.add("Mehmet");
        que.add("Beyza");

        System.out.println("que = " + que);

        //FIFO -- first in first out
        String name = que.remove().toLowerCase().toUpperCase().trim(); // ilk elementi verir ve listeden siler

        System.out.println("name = " + name);

        System.out.println("que = " + que);

        //FIFO - First out- removes first element from the list

        name = que.poll(); // ilk elementi verir ve listeden siler
        System.out.println("name = " + name);

        System.out.println("que = " + que);

        // gets the first element in the order
        name = que.peek(); // ilk elementi verir ve listeden silmez
        System.out.println("name = " + name);
        System.out.println("que = " + que);

        // Difference between poll and remove
        // Liste boşsa remove da hata verir ama poll da hata vermez.

        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);
        que.poll();
        System.out.println("que = " + que);

        try {
            que.remove();}
        catch (NoSuchElementException e){
            System.out.println("Hopp! Your list is empty");
        }


    }
}
