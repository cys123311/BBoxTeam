package com.example.boxteam.ui.home.bean;

public class DetailsBean {
    private int image;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    private String string;

    public DetailsBean(int image, String string) {
        this.image = image;
        this.string = string;
    }

    public DetailsBean() {
    }

    public DetailsBean(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
