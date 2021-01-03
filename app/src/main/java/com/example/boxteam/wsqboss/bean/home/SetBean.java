package com.example.boxteam.wsqboss.bean.home;

public class SetBean {

    private int image;
    private String set;
    private String teacher_name;
    private String time;
    private String price;

    public SetBean() {
    }

    public SetBean(int image, String set, String teacher_name, String time, String price) {
        this.image = image;
        this.set = set;
        this.teacher_name = teacher_name;
        this.time = time;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
