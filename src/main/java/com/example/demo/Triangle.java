package com.example.demo;

public class Triangle {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public void draw() {
        System.out.println("Drawing" + getType() + "Triangle");
    }
}
