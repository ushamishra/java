package collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

class ScoreComprator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getPercentage(),o2.getPercentage());
    }
}

public class ArrayDequeExample {
    public static void main(String[] args) {
        // 1. Initialize an ArrayDeque
        Deque<String> browserHistory = new ArrayDeque<>();

        // 2. Add elements to the tail/back (Standard Queue behavior)
        browserHistory.addLast("Homepage.com");
        browserHistory.addLast("News.com");
        browserHistory.addLast("Store.com");
        System.out.println("Current History: " + browserHistory);

        // 3. Push an item directly to the front (Stack behavior)
        browserHistory.addFirst("Urgent_Alert.com");
        System.out.println("After adding urgent page to front: " + browserHistory);

        // 4. Peek at both ends without removing
        System.out.println("First item (peek): " + browserHistory.peekFirst());
        System.out.println("Last item (peek): " + browserHistory.peekLast());

        // 5. Remove items from both ends
        String removedFirst = browserHistory.pollFirst(); // Removes from front
        System.out.println("Closed front page: " + removedFirst);

        String removedLast = browserHistory.pollLast();   // Removes from back
        System.out.println("Closed oldest back page: " + removedLast);

        // 6. Final State
        System.out.println("Remaining History: " + browserHistory);
    }
}
