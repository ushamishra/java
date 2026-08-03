package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        // 1. Min-Heap (default) - smallest element has highest priority
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);

        System.out.println("Min-Heap order:");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll()); // 10, 20, 30, 50
        }

        // 2. Max-Heap using a Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(30);

        System.out.println("Max-Heap order:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // 50, 30, 10
        }


        // 3. PriorityQueue of custom objects
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                Comparator.comparingInt(t -> t.priority)
        );
        taskQueue.add(new Task("Low priority job", 3));
        taskQueue.add(new Task("Urgent job", 1));
        taskQueue.add(new Task("Medium job", 2));

        System.out.println("Task order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " (priority=" + priority + ")";
    }
}
