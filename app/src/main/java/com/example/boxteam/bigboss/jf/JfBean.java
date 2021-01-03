package com.example.boxteam.bigboss.jf;

public class JfBean {
    private String data;
    private String time;
    private int count;

    public JfBean() {
    }

    public JfBean(String data, String time, int count) {
        this.data = data;
        this.time = time;
        this.count = count;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
