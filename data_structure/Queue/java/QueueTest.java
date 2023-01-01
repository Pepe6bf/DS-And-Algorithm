package data_structure.queue;

import data_structure.queue.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        System.out.println("===== enqueue() 세 번 호출 =====");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.front().getData());

        System.out.println("===== dequeue() 네 번 호출 =====");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println("isEmpty : " + queue.isEmpty());

    }
}
