package ru.inno.uni.gradleTest;

import java.math.BigInteger;

/**
 * ru.inno.uni.gradleTest.Counter for numbers
 * Created by julia on 09.12.2016.
 * @author Julia Savicheva
 */
public class Counter {
    /**
     * Current ru.inno.uni.gradleTest.Counter value
     */
    private BigInteger count;

    /**
     * ru.inno.uni.gradleTest.Counter class constructor
     */
    public Counter() {
        this.count = BigInteger.ZERO;
    }

    /**
     * @return current state of counter
     */
    public String getCount() {
        return count.toString();
    }

    /**
     * @param inc value that will be added to counter
     */
    public void increment(BigInteger inc) {
        this.count = this.count.add(inc);
    }
}
