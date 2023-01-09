package data_structure.deque;

import data_structure.linked_list.doubly_linked_list.DoublyLinkedList;
import data_structure.linked_list.doubly_linked_list.Node;

public class Deque <T> {
    DoublyLinkedList<T> list;

    public Deque() {
        list = new DoublyLinkedList<>();
    }

    /**
     * 모든 요소 출력
     */
    public void printAll() {
        list.printAll();
    }

    /**
     * 헤드에 값 삽입
     */
    public void addFirst(T data) {
        list.insertAt(0, data);
    }

    /**
     * 헤드 값 삭제
     */
    public Node<T> removeFirst() {
        return list.deleteAt(0);
    }

    /**
     * 테일 값 삽입
     */
    public void addLast(T data) {
        list.insertAt(list.getCount(), data);
    }

    /**
     * 테일 값 삭제
     */
    public Node<T> removeLast() {
        return list.deleteLast();
    }

    /**
     * 리스트가 비었는지 체크
     */
    public boolean isEmpty() {
        return list.getCount() == 0;
    }
}
