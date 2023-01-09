package data_structure.hash_table;

public class HashData <T> {
    int key;
    T value;

    public HashData(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
