package com.example.boxteam.wsqboss.bean.home;

public class LiveBean {
    private int image;
    private String name;
    private String text;
    private String text_lian;
    private String teacher_name;
    private String time;


    public String getText_lian() {
        return text_lian;
    }

    public void setText_lian(String text_lian) {
        this.text_lian = text_lian;
    }

    public LiveBean(int image, String name, String text, String text_lian, String teacher_name, String time) {
        this.image = image;
        this.name = name;
        this.text = text;
        this.text_lian = text_lian;
        this.teacher_name = teacher_name;
        this.time = time;
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

    public LiveBean() {
    }

    public LiveBean(int image, String name, String text) {
        this.image = image;
        this.name = name;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
