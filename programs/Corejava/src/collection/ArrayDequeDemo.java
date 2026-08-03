package collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(67);
        deque.add(100);
        deque.add(90);
        deque.add(20);
        deque.add(56);
        deque.addLast(78);
        deque.addFirst(45);
        deque.addLast(99);
        deque.addFirst(156);




        System.out.println("Max-Heap order:");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll()); // 50, 30, 10
        }
    }
}
