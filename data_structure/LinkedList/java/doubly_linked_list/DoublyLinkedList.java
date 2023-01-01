package data_structure.linked_list.doubly_linked_list;

public class DoublyLinkedList <T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    /**
     * 전체 요소 출력
     */
    public void printAll() {
        Node<T> currentNode = this.head;
        String text = "[";

        while (currentNode != null) {
            text += currentNode.getData();
            currentNode = currentNode.getNext();

            if (currentNode != null) {
                text += ", ";
            }
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
     * 요소 추가
     */
    public void insertAt(int index, T data) {
        if (index > count || index < 0) {
            throw new IndexOutOfBoundsException("범위를 넘어갔습니다.");
        }

        Node<T> newNode = new Node<>(data);

        if (index == 0) {
            newNode.setNext(head);
            if (head != null) {
                head.setPrev(newNode);
            }
            head = newNode;
        } else if (index == count) {
            newNode.setNext(null);
            newNode.setPrev(tail);
            tail.setNext(newNode);
        } else {
            Node<T> currentNode = head;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            newNode.setPrev(currentNode);
            currentNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }

        if (newNode.getNext() == null) {
            tail = newNode;
        }
        count++;
    }

    /**
     * 리스트 끝에 요소 추가
     */
    public void insertLast(T data) {
        insertAt(count, data);
    }

    /**
     * 요소 삭제
     */
    public Node<T> deleteAt(int index) {
        if (index >= this.count || index < 0) {
            throw new IndexOutOfBoundsException("잘못된 범위입니다.");
        }

        Node<T> currentNode = head;

        if (index == 0) {
            Node<T> deleteNode = head;
            if (head.getNext() == null) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }

            count--;
            return deleteNode;
        } else if (index == count - 1) {
            Node<T> deleteNode = tail;
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
            count--;

            return deleteNode;
        } else {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }

            Node<T> deleteNode = currentNode.getNext();
            currentNode.setNext(currentNode.getNext().getNext());
            currentNode.getNext().setPrev(currentNode);
            count--;

            return deleteNode;
        }
    }

    /**
     * 끝 요소 삭제
     */
    public Node<T> deleteLast() {
        return deleteAt(count - 1);
    }

    /**
     * 요소 조회
     */
    public Node<T> getNodeAt(int index) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException("잘못된 범위입니다!");
        }

        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
