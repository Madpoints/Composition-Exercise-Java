package com.Madpoints;

public class Room {
    private Dimensions dimensions;
    private Door door;
    private Window window;
    private Light lightFixture;
    private LightSwitch lightSwitch;
    private Table table;
    private Chair chair;
    private Sofa sofa;
    private boolean inRoom;

    public Room(Dimensions dimensions, Door door, Window window, Light lightFixture, LightSwitch lightSwitch, Table table, Chair chair, Sofa sofa) {
        this.dimensions = dimensions;
        this.door = door;
        this.window = window;
        this.lightFixture = lightFixture;
        this.lightSwitch = lightSwitch;
        this.table = table;
        this.chair = chair;
        this.sofa = sofa;
        this.inRoom = false;
    }

    public void enterExitRoom() {
        if (this.inRoom) {
            System.out.println("Left the room");
            turnOnLight();
            this.inRoom = false;
        } else {
            System.out.println("Entered the room");
            turnOnLight();
            this.inRoom = true;
        }
    }

    private void turnOnLight() {
        lightSwitch.flipSwitch();
    }

}
