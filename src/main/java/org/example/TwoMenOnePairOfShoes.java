package org.example;

import java.util.ArrayList;

public class TwoMenOnePairOfShoes {

    private volatile Integer leftShoe = 1;
    private volatile Integer rightShoe = 1;

    public synchronized void takeLeft() {
        synchronized (leftShoe) {
            leftShoe = 0;
            synchronized (rightShoe) {
                rightShoe = 0;
                walk();
            }
        }
    }

    public void takeRight() {
        synchronized (rightShoe) {
            rightShoe = 0;
            synchronized (leftShoe) {
                leftShoe = 0;
                walk();
            }
        }
    }

    public void walk() {
        leftShoe = 1;
        rightShoe = 1;
    }
}
