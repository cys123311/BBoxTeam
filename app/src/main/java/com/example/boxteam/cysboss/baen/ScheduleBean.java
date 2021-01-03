package com.example.boxteam.cysboss.baen;

public class ScheduleBean {
    private String title1;
    private String title2;
    private String title3;
    private int count;

    public ScheduleBean(String title1, String title2, String title3, int count) {
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.count = count;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
