package data_structure.stack;

import data_structure.linked_list.LinkedList;
import data_structure.linked_list.Node;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        this.list = new LinkedList<T>();
    }

    /**
     * 스택 맨 위에 데이터 삽입
     */
    public void push(T data) {
        list.insertAt(0, data);
    }

    /**
     * 스택 맨 위에 데이터를 추출
     */
    public Node<T> pop() {
        try {
            return list.deleteAt(0);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 스택 맨 위에 데이터를 확인
     */
    public Node<T> peek() {
        return list.getNodeAt(0);
    }

    /**
     * 스택이 비었는지 체크
     */
    public boolean isEmpty() {
        return list.getCount() == 0;
    }
}
