package com.javalearnings.collections.lists;

import java.util.Arrays;

public class CustomList implements List {

    private static final Integer DEFAULT_SIZE = 10;
    private static final Float THRESHOLD = 0.75f;
    private Object[] data;
    private Integer counter = 0;

    public CustomList() {
        this(DEFAULT_SIZE);
    }

    public CustomList(Integer arraySize) {
        this.data = new Object[arraySize];
    }

    @Override
    public void add(Object data) {
        if (hasThresholdCrossed()) {
            updateSize(2 * this.data.length);
        }
        this.data[counter++] = data;

    }

    @Override
    public void remove(Object data) {
        int index = indexOf(data);
        if (index == -1) {
            return;
        }
        for (int i = index; i < this.data.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.data.length - 1] = null;
        counter--;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    private boolean hasThresholdCrossed() {
        return data.length * THRESHOLD < counter;
    }

    private void updateSize(int size) {
        Object[] temp = new Object[size];
        System.arraycopy(data, 0, temp, 0, counter);
        data = temp;
    }

    private int indexOf(Object object) {
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] != null && data[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    public Object[] getData() {
        return data;
    }

    public Integer getCounter() {
        return counter;
    }
}
