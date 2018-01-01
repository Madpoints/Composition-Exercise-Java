package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Door door = new Door("Wood", new Dimensions(7, 3, 0.2), "West");
        Window window = new Window("Double Pane", new Dimensions(3, 2.5, .25), "East");
        Sofa sofa = new Sofa("Over Stuffed", new Dimensions(4, 10, 4), "Pleather", "Tan", 4);
        Chair chair = new Chair("Recliner", new Dimensions(4.5, 4, 4), "Pleather", "Tan");
        Table table = new Table("Coffee", new Dimensions(2.5, 5, 2.5), "Wood", "Dark Brown", "Rectangular");
        Light lightFixture = new Light("Incandescent", 60);
        LightSwitch lightSwitch = new LightSwitch();

        Room livingRoom = new Room(new Dimensions(10, 14, 15), door, window, lightFixture, lightSwitch, table, chair, sofa);

        livingRoom.enterExitRoom();
        livingRoom.enterExitRoom();
    }
}
