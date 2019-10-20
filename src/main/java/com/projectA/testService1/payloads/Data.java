package com.projectA.testService1.payloads;

public class Data {
    private int a;
    private String str;

    public Data() { }

    public Data(int a, String str) {
        this.a = a;
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
