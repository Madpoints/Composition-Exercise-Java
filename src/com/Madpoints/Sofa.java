package com.Madpoints;

public class Sofa extends Chair {
    private int seats;

    public Sofa(String type, Dimensions dimensions, String material, String color, int seats) {
        super(type, dimensions, material, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}
