package com.hbee.honeybee.entity;

import java.util.Objects;

public class MergeKey {
	private final short x;
    private final short y;

    public MergeKey(short x, short y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MergeKey that = (MergeKey) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}