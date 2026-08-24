import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {

    private List<Pair<K, V>>[] values;
    private int elementCount;

    public HashMap() {
        this.values = (List<Pair<K, V>>[]) new List[32];
        this.elementCount = 0;
    }

    public V get(K key) {
        int hashValue = getHash(key, this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            Pair<K, V> pair = valuesAtIndex.get(i);
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.elementCount++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }

        if (1.0 * this.elementCount / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(index); // Removes by index
        this.elementCount--;
        return pair.getValue();
    }

    private int getHash(K key, int length) {
        return (key.hashCode() & 0x7fffffff) % length;
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = getHash(key, this.values.length);
        if (this.values[hashValue] == null) {
            this.values[hashValue] = new ArrayList<>();
        }

        return this.values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        List<Pair<K, V>>[] newArray = (List<Pair<K, V>>[]) new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != null) {
                copy(newArray, i);
            }
        }

        this.values = newArray;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].get(i);

            int hashValue = getHash(value.getKey(), newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(value);
        }
    }
}