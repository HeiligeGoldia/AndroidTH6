package com.example.androidth6;

public class Shoe {

    private String name;
    private int picture;

    public Shoe(String name, int picture) {
        this.name = name;
        this.picture = picture;
    }

    public Shoe() {
    }

    public String getName() {
        return name;
    }

    public int getPicture() {
        return picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", picture=" + picture +
                '}';
    }
}
