package org.example;

public class SafeCounter {
    private volatile Integer value = 0;

    public synchronized void inc() {
        ++value;
    }
    public synchronized Integer get() {
        return value;
    }
}
