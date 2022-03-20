package com.pen.models;

import com.pen.strategies.IRefillStrategy;

public abstract class Pen implements IWrite {
    public Integer getWriteCapacityRemaining() {
        return writeCapacityRemaining;
    }

    public void setWriteCapacityRemaining(Integer writeCapacityRemaining) {
        this.writeCapacityRemaining = writeCapacityRemaining;
    }

    public Integer getWriteCapacityAllocated() {
        return writeCapacityAllocated;
    }

    private Integer writeCapacityRemaining;
    private Integer writeCapacityAllocated;

    Pen(Integer x){
        this.writeCapacityRemaining = x;
        this.writeCapacityAllocated = x;
    }

    public abstract void refill(IRefillStrategy rs, Pen p);
    @Override
    public abstract void write();
    public abstract boolean is_working();
}
