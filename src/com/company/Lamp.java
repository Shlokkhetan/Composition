package com.company;

public class Lamp {
    private String Style;
    private boolean Battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        Style = style;
        Battery = battery;
        this.globRating = globRating;
    }
    private  void isOn(){
        System.out.println("The lamp is being turned on");
    }

    public String getStyle() {
        return Style;
    }

    public boolean isBattery() {
        return Battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
