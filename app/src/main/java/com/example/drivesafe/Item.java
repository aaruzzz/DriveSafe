package com.example.drivesafe;

public class Item {
    String addr1;
    String addr2;

    public Item(String addr1, String addr2) {
        this.addr1 = addr1;
        this.addr2 = addr2;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }
}
