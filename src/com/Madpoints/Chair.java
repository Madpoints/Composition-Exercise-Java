package com.Madpoints;

public class Chair {
    private String type;
    private Dimensions dimensions;
    private String material;
    private String color;

    public Chair(String type, Dimensions dimensions, String material, String color) {
        this.type = type;
        this.dimensions = dimensions;
        this.material = material;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
