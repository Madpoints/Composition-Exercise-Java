package com.Madpoints;

public class Table extends Chair {
    private String shape;

    public Table(String type, Dimensions dimensions, String material, String color, String shape) {
        super(type, dimensions, material, color);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
