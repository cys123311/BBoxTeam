package com.example.boxteam.lc.bean;

public class GiftMessage {
    private String name;
    private String can;
    private String gift;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    //    public GiftMessage(String name, String can, String gift) {
//        this.name = name;
//        this.can = can;
//        this.gift = gift;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }
}
