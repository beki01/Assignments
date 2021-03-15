package com.ss.mar.jb.five;

public class Words {

    private String str;
    private int length;


    public Words(String str ) {
        this.str = str;
        this.length = str.length();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.length = str.length();
        this.str = str;
    }

    public int getLength() {
        return length;
    }


}
