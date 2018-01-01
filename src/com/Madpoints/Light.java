package com.Madpoints;

public class Light {
    private String type;
    private int wattage;

    public Light(String type, int wattage) {
        this.type = type;
        this.wattage = wattage;
    }

    public String getType() {
        return type;
    }

    public int getWattage() {
        return wattage;
    }
}
