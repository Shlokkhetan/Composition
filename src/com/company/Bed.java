package com.company;

public class Bed {
    private String Style;
    private int Pillows;
    private int Height;
    private int Sheet;
    private int Quilt;

    public Bed(String style, int pillows, int height, int sheet, int quilt) {
        Style = style;
        Pillows = pillows;
        Height = height;
        Sheet = sheet;
        Quilt = quilt;
    }

    public void make(){
        System.out.println("The bed is being made");
    }

    public String getStyle() {
        return Style;
    }

    public int getPillows() {
        return Pillows;
    }

    public int getHeight() {
        return Height;
    }

    public int getSheet() {
        return Sheet;
    }

    public int getQuilt() {
        return Quilt;
    }
}
