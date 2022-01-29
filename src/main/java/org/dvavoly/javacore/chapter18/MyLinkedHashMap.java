package org.dvavoly.javacore.chapter18;

import java.util.LinkedHashMap;

public class MyLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    private static final int MAX_ENTRIES = 5;

    public MyLinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // allow a map to grow to a maximum size of 5 entries 
        return size() > MAX_ENTRIES;
    }
}
