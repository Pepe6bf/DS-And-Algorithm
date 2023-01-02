package data_structure.hash_table;

import data_structure.linked_list.doubly_linked_list.DoublyLinkedList;
import data_structure.linked_list.doubly_linked_list.Node;

import java.util.ArrayList;
import java.util.List;

public class HashTable <T> {

    List<DoublyLinkedList<HashData>> arr = new ArrayList<>();

    public HashTable() {
        for (int i = 0; i < 10; i++) {
            arr.add(new DoublyLinkedList<>());
        }
    }

    public int hashFunction(int number) {
        return number % 10;
    }

    public void set(int key, T value) {
        arr.get(hashFunction(key)).insertAt(0, new HashData(key, value));
    }

    public T get(int key) {
        Node<HashData<T>> currentNode = arr.get(hashFunction(key)).getHead();

        while (currentNode != null) {
            if (currentNode.getData().key == key) {
                return currentNode.getData().value;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public Node<HashData> remove(int key) {
        DoublyLinkedList<HashData> list = arr.get(hashFunction(key));
        Node<HashData<T>> currentNode = list.getHead();
        int deletedIndex = 0;
        while (currentNode != null) {
            if (currentNode.getData().key == key) {
                return list.deleteAt(deletedIndex);
            }
            currentNode = currentNode.getNext();
            deletedIndex++;
        }
        return null;
    }
}
