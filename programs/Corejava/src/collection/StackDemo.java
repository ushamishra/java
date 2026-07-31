package collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> stackStr = new Stack<>();

        stackStr.push("Apple");
        stackStr.push("Bannana");
        stackStr.push("Apple");
        stackStr.push("Orange");

        System.out.println(stackStr.size());
        System.out.println(stackStr.pop());
        System.out.println(stackStr.size());

        System.out.println(stackStr.get(2));
        System.out.println(stackStr.size());



    }
}
