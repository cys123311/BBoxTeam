package com.example.boxteam.ui.home.bean;

public class IntroduceBean {

    private int image;
    private String name;
    private String musical;
    private String type;

    public IntroduceBean() {
    }

    public IntroduceBean(int image, String name, String musical, String type) {
        this.image = image;
        this.name = name;
        this.musical = musical;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusical() {
        return musical;
    }

    public void setMusical(String musical) {
        this.musical = musical;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
