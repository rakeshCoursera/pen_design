package com.pen.client;

import com.pen.models.BallPen;
import com.pen.models.InkPen;
import com.pen.models.Pen;
import com.pen.strategies.FillStrategy;
import com.pen.strategies.IRefillStrategy;
import com.pen.strategies.ReplaceStrategy;

public class Client {
    public static void main(String[] args) {
        Pen p1 = new InkPen(105);
        Pen p2 = new BallPen(100);
        IRefillStrategy rs1 = new FillStrategy();
        IRefillStrategy rs2 = new ReplaceStrategy();

        System.out.printf("\n### Ink Pen Testing ###\n");
        for(int i = 0; i < 5; i++) {
            if (p1.is_working()) {
                p1.write();
            } else {
                p1.refill(rs1, p1);
            }
            System.out.printf("\n");
        }

        System.out.printf("\n### Ball Pen Testing ###\n");
        for(int i = 0; i < 5; i++) {
            if (p2.is_working()) {
                p2.write();
            } else {
                p2.refill(rs1, p2);
            }
            System.out.printf("\n");
        }
    }
}
