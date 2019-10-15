package com.mainacad.Triangle;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;

public class Triangle extends AbstractShape {
    private double base;
    private double heights;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeights() {
        return heights;
    }

    public void setHeights(double heights) {
        this.heights = heights;
    }

    @Override
    public double getArea() {
        return (base * heights / 2) ;
    }
}
