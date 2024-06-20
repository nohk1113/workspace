package com.green.DataPractice.vo;

import java.util.Arrays;

public class ScoreControllerVO {
    private String name;
    private String grand;
    private String[] tell;
    private String gender;
    private int koScore;
    private int enScore;
    private int maScore;
    private double avg;



    public double avg(){
        avg=(koScore+enScore+maScore)/3.0;
        return avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    public String[] getTell() {
        return tell;
    }

    public void setTell(String[] tell) {
        this.tell = tell;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getKoScore() {
        return koScore;
    }

    public void setKoScore(int koScore) {
        this.koScore = koScore;
    }

    public int getEnScore() {
        return enScore;
    }

    public void setEnScore(int enScore) {
        this.enScore = enScore;
    }

    public int getMaScore() {
        return maScore;
    }

    public void setMaScore(int maScore) {
        this.maScore = maScore;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "ScoreControllerVO{" +
                "name='" + name + '\'' +
                ", grand='" + grand + '\'' +
                ", tell=" + Arrays.toString(tell) +
                ", gender='" + gender + '\'' +
                ", koScore=" + koScore +
                ", enScore=" + enScore +
                ", maScore=" + maScore +
                ", avg=" + avg +
                '}';
    }
}
