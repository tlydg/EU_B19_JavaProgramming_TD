package day54_Collections_Queue_Set.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue priority = new PriorityQueue();
        priority.add(12);
        priority.add(15);
        priority.add(5);
        priority.add(6);
        priority.add(25);
        priority.add(35);
        priority.add(35); // Duplicate veri kabul eder
        priority.add(356);
        priority.add(351);
        priority.add(354);
        priority.add(-12);

        // en küçüğü en önce getirir
        System.out.println("priority = " + priority);

        System.out.println(priority.peek()); // ilk elementi verir
        System.out.println(priority.poll());

        System.out.println(priority);

        System.out.println(priority.peek());
        System.out.println(priority.poll());

        System.out.println(priority);


        while (!priority.isEmpty()){
            System.out.println(priority.poll());
        }

        // doğal sıralama alfabetik olarak dataları bize verir, ama önce büyük harfleri verir
        PriorityQueue<String> strs = new PriorityQueue<>();
        strs.add("Zab");
        strs.add("Aab");
        strs.add("Bab");
        strs.add("aab");
        strs.add("Aaa");
        strs.add("Aba");
        strs.add("Aab"); //duplicate kabul eder

        System.out.println();
        System.out.println(strs.poll());
        System.out.println(strs.poll());
        System.out.println(strs.poll());
        System.out.println(strs.poll());
        System.out.println(strs.poll());

    }
}
