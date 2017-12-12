package com.example.android.bunktuality.Statistics;

/**
 * Created by Ishan on 11-12-2017.
 */

public class Stats {
    private String subName;
    private int credits;
    private int total;
    private int attended;
    private int missed;
    Stats(String a, int c, int t){
        subName=a;
        credits=c;
        total=t;
        attended=0;
        missed=0;
    }
    public String getSubName(){
        return subName;
    }

    public int getCredits() {
        return credits;
    }

    public int getTotal() {
        return total;
    }

    public int getAttended() {
        return attended;
    }

    public int getMissed() {
        return missed;
    }
    public void setAttended(int a){attended=a;}
    public void setMissed(int m){missed=m;}
}
