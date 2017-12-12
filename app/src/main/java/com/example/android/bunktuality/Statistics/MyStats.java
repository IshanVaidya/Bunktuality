package com.example.android.bunktuality.Statistics;

import java.util.ArrayList;

/**
 * Created by Ishan on 11-12-2017.
 */

public class MyStats {
    private Stats os;
    private Stats ca;
    private Stats cn;
    private Stats pe;
    private Stats se;
    public MyStats(){
        os=new Stats("Operating System", 4, 48);
        ca=new Stats("Computer Architecture",3,36);
        cn=new Stats("Computer Networks",4,48);
        pe=new Stats("Program Elective",3,36);
        se=new Stats("Software Engineering",4,48);
    }
    public Stats getOs(){
        return os;
    }

    public Stats getCa() {
        return ca;
    }

    public Stats getCn() {
        return cn;
    }

    public Stats getPe() {
        return pe;
    }

    public Stats getSe() {
        return se;
    }
    public ArrayList<Stats> getStats(){
        ArrayList<Stats> stat=new ArrayList<Stats>();
        stat.add(os);
        stat.add(ca);
        stat.add(cn);
        stat.add(pe);
        stat.add(se);
        return stat;
    }

}
