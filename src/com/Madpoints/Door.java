package com.Madpoints;

public class Door {
    private String type;
    private Dimensions dimensions;
    private String facing;

    public Door(String type, Dimensions dimensions, String facing) {
        this.type = type;
        this.dimensions = dimensions;
        this.facing = facing;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getFacing() {
        return facing;
    }
}
