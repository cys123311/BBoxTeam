package com.example.boxteam.ui.home.bean;

public class CourseBean {
    private int image;
    private String name;
    private String sum;
    private String text;

    public CourseBean() {
    }

    public CourseBean(int image, String name, String sum, String text) {
        this.image = image;
        this.name = name;
        this.sum = sum;
        this.text = text;
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

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
