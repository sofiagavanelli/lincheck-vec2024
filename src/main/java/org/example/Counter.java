package org.example;

public class Counter {
    private volatile Integer value = 0;

    public void inc() {
        ++value;
    }
    public Integer get() {
        return value;
    }
}
