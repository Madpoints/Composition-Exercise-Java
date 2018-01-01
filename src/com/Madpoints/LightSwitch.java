package com.Madpoints;

public class LightSwitch {
    private boolean on;

    public LightSwitch() {
        this.on = false;
    }

    public void flipSwitch() {
        if(this.on) {
            System.out.println("Light off");
            this.on = false;
        } else {
            System.out.println("Light on");
            this.on = true;
        }
    }

    public boolean isOn() {
        return on;
    }
}
