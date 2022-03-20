package com.pen.strategies;

import com.pen.models.Pen;

public class ReplaceStrategy implements IRefillStrategy {

    @Override
    public void refill(Pen p) {
        System.out.printf("Refill by replace strategy");
        p.setWriteCapacityRemaining(p.getWriteCapacityAllocated());
    }
}
