package org.example.structural.decorator.house;

public abstract class House {
    private String info = "House";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public int getPrice() {
        return 1000;
    }
}

