
import java.util.Arrays;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalutoww
 */
public class List<T> {

    private T[] items;
    private int firstFreeIndex;

    public List() {
        this.items = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value) {
        this.items[firstFreeIndex] = value;
        this.firstFreeIndex++;

        if (this.firstFreeIndex == this.items.length) {
            this.grow();
        }
    }

    public boolean contains(T value) {

        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.items[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (Objects.equals(this.items[i], value)) {
                this.shrink(i);
                this.firstFreeIndex--;
                this.items[this.firstFreeIndex] = null;
                return;
            }

        }
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new IndexOutOfBoundsException();
        }

        return this.items[index];
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (Objects.equals(this.items[i], value)) {
                return i;
            }
        }

        return -1;
    }

    public int size(){
        return this.firstFreeIndex;
    }
    
    private void shrink(int startIndex) {
        for (int i = startIndex; i < firstFreeIndex - 1; i++) {
            this.items[i] = this.items[i + 1];
        }

    }

    private void grow() {
        int newSize = this.items.length + this.items.length / 2;

        this.items = Arrays.copyOf(this.items, newSize);
    }
}
