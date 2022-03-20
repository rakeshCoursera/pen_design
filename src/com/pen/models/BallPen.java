package com.pen.models;

import com.pen.strategies.IRefillStrategy;

public class BallPen extends Pen {
    public BallPen(Integer x) {
        super(x);
    }

    @Override
    public void refill(IRefillStrategy rs, Pen p) {
        rs.refill(p);
    }

    @Override
    public void write() {
        System.out.printf("Written by Ball Pen");
        setWriteCapacityRemaining(getWriteCapacityRemaining()-25);
    }

    @Override
    public boolean is_working() {
        if(getWriteCapacityRemaining()-25 < 1){
            return false;
        }
        return true;
    }
}
