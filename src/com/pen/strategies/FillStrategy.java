package com.pen.strategies;

import com.pen.models.Pen;

public class FillStrategy implements IRefillStrategy{
    @Override
    public void refill(Pen p) {
        System.out.printf("Refill by fill strategy");
        p.setWriteCapacityRemaining(p.getWriteCapacityAllocated());
    }
}
