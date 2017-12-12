package com.example.android.bunktuality.Timetable;

/**
 * Created by Ishan on 08-12-2017.
 */

public class Schedule {
    private String sub;
    private String start;
    private String end;

    public Schedule(String a, String b, String c){
        sub=a;
        start=b;
        end=c;
    }
    public String getSub(){
        return sub;
    }
    public String getStart(){
        return start;
    }
    public String getEnd(){
        return end;
    }
}
