package data_structure.hast_set;

import data_structure.hash_table.HashData;
import data_structure.hash_table.HashTable;
import data_structure.linked_list.doubly_linked_list.Node;

public class HashSet {
    HashTable<Integer> hashTable;

    public HashSet() {
        this.hashTable = new HashTable<>();
    }

    public void add(int data) {
        if (hashTable.get(data) == null) {
            hashTable.set(data, -1);
        }
    }

    public boolean isContain(int data) {
        return hashTable.get(data) != null;
    }

    public void remove(int data) {
        hashTable.remove(data);
    }

    public void clear() {
        for (int i = 0; i < hashTable.getArr().size(); i++) {
            hashTable.getArr().get(i).clear();
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < hashTable.getArr().size(); i++) {
            if (hashTable.getArr().get(i).getCount() > 0) {
                empty = false;
                break;
            }
        }

        return empty;
    }

    public void printAll() {
        for (int i = 0; i < hashTable.getArr().size(); i++) {
            Node<HashData<Integer>> currentNode = hashTable.getArr().get(i).getHead();
            while (currentNode != null) {
                System.out.println(currentNode.getData().getKey());
                currentNode = currentNode.getNext();
            }
        }
    }
}
