package data_structure.linked_list.singly_linked_list;


public class LinkedList <T> {
    Node<T> head;
    private int count;

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }

    /**
     * 원하는 위치에 요소 추가
     */
    public void insertAt(int index, T data) {

        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> newNode = new Node<>(data, null);

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode);
            currentNode.setNext(newNode);
        }

        count++;
    }

    /**
     * 원하는 위치의 요소 조회
     */
    public Node<T> getNodeAt(int index) {
        if (index >= count || index < 0)
            throw new IndexOutOfBoundsException();

        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    /**
     * 원하는 위치의 요소 삭제
     */
    public Node<T> deleteAt(int index) {
        if (index >= count || index < 0)
            throw new IndexOutOfBoundsException();

        Node<T> currentNode = head;

        if (index == 0) {
            Node<T> deleteNode = head;
            head = head.getNext();
            count--;

            return deleteNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }

            Node<T> deleteNode = currentNode.getNext();
            currentNode = currentNode.getNext().getNext();
            count--;

            return deleteNode;
        }
    }

    /**
     * 전체 요소 출력
     */
    public void printAll() {
        Node<T> currentNode = head;
        String text = "[";

        for (int i = 0; i < count; i++) {
            text += String.valueOf(currentNode.getData());

            if (i != count - 1)
                text += ", ";

            currentNode = currentNode.getNext();
        }
        text += "]";

        System.out.println(text);
    }

    /**
     * 전체 요소 초기화
     */
    public void clear() {
        head = null;
        count = 0;
    }

    /**
     * 리스트 맨 뒤에 요소 추가하기
     */
    public void insertLast(T data) {
        insertAt(count, data);
    }

    /**
     * 맨 뒤에 요소 삭제하기
     */
    public Node<T> deleteLast() {
        return deleteAt(count - 1);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
