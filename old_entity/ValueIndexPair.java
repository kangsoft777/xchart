package com.hbee.honeybee.entity;

public class ValueIndexPair implements Comparable<ValueIndexPair> {
    public Double value;
    public int index;

    public ValueIndexPair(Double value, int index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(ValueIndexPair other) {
        return this.value.compareTo(other.value);
    }
}
