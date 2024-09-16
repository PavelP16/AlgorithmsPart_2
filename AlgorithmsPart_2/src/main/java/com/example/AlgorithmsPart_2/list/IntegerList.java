package com.example.AlgorithmsPart_2.list;

import java.util.Arrays;

public interface MyList<T> {
    void add(T value);
    void remove(int index);
    T get(int index);
    int size();
}

public class IntegerList implements MyList<Integer> {
    private Integer[] elements;
    private int size;

    public IntegerList() {
        elements = new Integer[10]; // начальный размер
        size = 0;
    }

    @Override
    public void add(Integer value) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = value;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Удаляем ссылку на освобожденный объект
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
}