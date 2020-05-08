package com.company.databaselaptops;

public class Laptop {
    private int id;
    private String brand;
    private String segment;
    private String keyboard;
    private String os;
    private String price;

    public Laptop() {
    }

    public Laptop(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Laptop(String brand, String segment, String keyboard, String os) {
        this.brand = brand;
        this.segment = segment;
        this.keyboard = keyboard;
        this.os = os;
    }

    public Laptop(int id, String brand, String segment, String keyboard, String os) {
        this.id = id;
        this.brand = brand;
        this.segment = segment;
        this.keyboard = keyboard;
        this.os = os;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "|ID:" + id + "|BRAND:" + brand + "|SEGMENT:"+ segment + "|KEYBOARD ILLUMINATION:"
                + keyboard + "|OS:" + os+"|PRICE:"+price+" KZT";
    }
}
