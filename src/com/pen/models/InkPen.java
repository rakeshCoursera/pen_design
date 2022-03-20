package com.pen.models;

import com.pen.strategies.IRefillStrategy;

public class InkPen extends Pen {
    public InkPen(Integer x) {
        super(x);
    }

    @Override
    public void refill(IRefillStrategy rs, Pen p) {
        rs.refill(p);
    }

    @Override
    public void write() {
        System.out.printf("Written by Ink Pen");
        setWriteCapacityRemaining(getWriteCapacityRemaining()-50);
    }

    @Override
    public boolean is_working() {
        if(getWriteCapacityRemaining()-50 < 1){
            return false;
        }
        return true;
    }
}
