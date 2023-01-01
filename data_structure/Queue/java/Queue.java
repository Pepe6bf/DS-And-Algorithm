package data_structure.queue;

import data_structure.linked_list.doubly_linked_list.DoublyLinkedList;
import data_structure.linked_list.doubly_linked_list.Node;

public class Queue <T> {
    private DoublyLinkedList<T> list = new DoublyLinkedList<>();

    /**
     * 데이터 삽입
     */
    public void enqueue(T data) {
        list.insertAt(0, data);
    }

    /**
     * 데이터 삭제
     */
    public Node<T> dequeue() {
        try {
            return list.deleteLast();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 데이터 확인
     */
    public Node front() {
        return list.getTail();
    }

    /**
     * 리스트가 비었는지 점검
     */
    public boolean isEmpty() {
        return list.getCount() == 0;
    }
}
