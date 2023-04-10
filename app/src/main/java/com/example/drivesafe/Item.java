package com.example.drivesafe;

public class Item {
    String addr1;
    String addr2;
    String card_percentage;

    String card_distance_in_km;
    String card_time;
    String card_highest_speed;
    String card_total_alert;
    String card_performance_percent;
    String card_performance_status;
    String card_date_and_time;



    public Item(String addr1, String addr2, String card_percentage,String card_distance_in_km, String card_time, String card_highest_speed, String card_total_alert,  String card_performance_percent, String card_performance_status, String card_date_and_time) {
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.card_percentage = card_percentage;
        this.card_distance_in_km = card_distance_in_km;
        this.card_time = card_time;
        this.card_highest_speed = card_highest_speed;
        this.card_total_alert = card_total_alert;
        this.card_performance_percent = card_performance_percent;
        this.card_performance_status = card_performance_status;
        this.card_date_and_time = card_date_and_time;
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


    public String getPercentage() {
        return card_percentage;
    }
    public void setPercentage(String card_percentage) {
        this.card_time = card_percentage;
    }


    public String getTotalDistance() {
        return card_distance_in_km;
    }

    public void setTotalDistance(String card_distance_in_km) {
        this.card_distance_in_km = card_distance_in_km;
    }

    public String getTotalTime() {
        return card_time;
    }
    public void setTotalTime(String card_time) {
        this.card_time = card_time;
    }

    public String getHighestSpeed() {
        return card_highest_speed;
    }
    public void setHighestSpeed(String card_time) {
        this.card_highest_speed = card_highest_speed;
    }

    public String getTotalAlerts() {
        return card_total_alert;
    }
    public void setTotalAlerts(String card_total_alert) {
        this.card_time = card_total_alert;
    }


    public String getPerformancePercentage() {
        return card_performance_percent;
    }
    public void setPerformancePercentage(String percentage) {
        this.card_performance_percent = percentage;
    }


    public String getPerformanceStatus() {
        return card_performance_status;
    }
    public void setPerformanceStatus(String card_performance_status) {
        this.card_time = Item.this.card_performance_status;
    }


    public String getDateandTime() {
        return card_date_and_time;
    }
    public void setDateandTime(String card_date_and_time) {
        this.card_time = Item.this.card_date_and_time;
    }




}
