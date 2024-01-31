package com.example.demo;

public class Triangle {

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int type) {
        this.height = type;
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    private String type;
    private int height;

    public void draw() {
        System.out.println("Drawing " + getType() + "Triangle with height: " + height);
    }
}
