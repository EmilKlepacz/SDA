package com.company;


import java.util.Arrays;

public class SecondMap<K , V> {
    private static final int DEFAULT_SIZE = 20;
    private Object[] keys = new Object[DEFAULT_SIZE];
    private Object[] values = new Object[DEFAULT_SIZE];
    private int index = 0;

    public void add(K key, V value) {
        keys[index] = key;
        values[index] = value;
        index++;
    }

    public Object get(Object key) {
        int position = -1;
        for (int i = 0; i < index; i++) {
            if (keys[i].equals(key)) position = i;
        }
        return position == -1 ? null : (V)values[position];

    }

    @Override
    public String toString() {
        return "SecondMap{" +
                "keys=" + Arrays.toString(keys) +
                ", values=" + Arrays.toString(values) +
                ", index=" + index +
                '}';
    }

    public boolean hasKey(K key) {
        return containsItem(keys, key);

    }

    public boolean hasValue(V value) {
        return containsItem(values, value);
    }

    private boolean containsItem(Object[] all, Object item){
        for (int i = 0; i <index ; i++) {
            if(item == all[i]) return true;
        }
        return false;
    }
}
