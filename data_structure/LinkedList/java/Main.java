package data_structure.linked_list;

public class Main {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);

        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println(node1.getData());
        System.out.println(node1.getNext().getData());
        System.out.println(node1.getNext().getNext().getData());

        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("======== insert_at() 다섯 번 호출 ========");
        list.insertAt(0, 0);
        list.insertAt(1, 1);
        list.insertAt(2, 2);
        list.insertAt(3, 3);
        list.insertAt(4, 4);
        list.printAll();

        System.out.println("======== clear() 호출 ========");
        list.clear();
        list.printAll();

        System.out.println("========.insertLast() 세 번 호출 ========");
        list.insertLast(0);
        list.insertLast(1);
        list.insertLast(2);
        list.printAll();

        System.out.println("======== delete_at() 호출 ========");
        list.deleteAt(0);
        list.printAll();
        list.deleteAt(1);
        list.printAll();

        System.out.println("======== delete_last() 호출 ========");
        list.insertLast(5);
        list.printAll();
        list.deleteLast();
        list.deleteLast();
        list.printAll();

        System.out.println("======== get_node_at() 호출 ========");
        list.insertAt(0, 1);
        list.insertAt(1,2);
        list.insertAt(2, 3);
        list.insertAt(3, 4);
        list.insertAt(4, 5);

        Node<Integer> second = list.getNodeAt(2);
        System.out.println(second);
        System.out.println(second.getData());
    }
}
