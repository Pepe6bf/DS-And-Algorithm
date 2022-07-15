package free_study;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
        queue.poll();
        System.out.println("queue = " + queue);
        System.out.println("queue.peek() = " + queue.peek());

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
        System.out.println("stack = " + stack);
        System.out.println("stack = " + stack.peek());

        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        System.out.println("deque = " + deque);

        deque.offerLast(2);
        System.out.println("deque = " + deque);

        deque.offerFirst(3);
        deque.offerLast(4);
        System.out.println("deque = " + deque);
        deque.pollFirst();
        System.out.println("deque = " + deque);
        deque.pollLast();
        System.out.println("deque = " + deque);
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekFirst() = " + deque.peekLast());

    }

}

