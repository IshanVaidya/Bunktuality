package com.example.android.bunktuality.Timetable;
import java.util.ArrayList;

/**
 * Created by Ishan on 11-12-2017.
 */

public class TimeTable {
    private ArrayList <Schedule> monday;
    private ArrayList <Schedule> tuesday;
    private ArrayList <Schedule> wednesday;
    private ArrayList <Schedule> thursday;
    private ArrayList <Schedule> friday;
    private ArrayList <Schedule> saturday;
    TimeTable(){
        monday = new ArrayList<Schedule>();
        monday.add(new Schedule("Operating System","8:00 AM","9:00 AM"));
        monday.add(new Schedule("Computer Network","9:00 AM","10:00 AM"));
        monday.add(new Schedule("Software Engineering","10:30 AM","11:30 AM"));
        monday.add(new Schedule("Computer Architecture","11:30 AM","12:30 PM"));
        monday.add(new Schedule("Operating System Lab","2:00 PM","3:00 PM"));

        tuesday = new ArrayList<Schedule>();
        tuesday.add(new Schedule("Program Elective-I","1:00 PM","2:00 PM"));
        tuesday.add(new Schedule("Operating System","2:00 PM","3:00 PM"));
        tuesday.add(new Schedule("Computer Networks","3:30 PM","4:30 PM"));

        wednesday = new ArrayList<Schedule>();
        wednesday.add(new Schedule("Software Engineering","8:00 AM","9:00 AM"));
        wednesday.add(new Schedule("Computer Architecture","9:00 AM","10:00 AM"));
        wednesday.add(new Schedule("Program Elective-I","10:30 AM","11:30 AM"));
        wednesday.add(new Schedule("Operating System Lab","2:00 PM","3:00 PM"));

        thursday = new ArrayList<Schedule>();
        thursday.add(new Schedule("Operating System","1:00 PM","2:00 PM"));
        thursday.add(new Schedule("Program Elective-I","2:00 PM","3:00 PM"));
        thursday.add(new Schedule("Computer Networks","3:30 PM","4:30 PM"));

        friday = new ArrayList<Schedule>();
        friday.add(new Schedule("Computer Networks","1:00 PM","2:00 PM"));
        friday.add(new Schedule("Operating System","2:00 PM","3:00 PM"));
        friday.add(new Schedule("Computer Architecture","3:30 PM","4:30 PM"));

        saturday = new ArrayList<Schedule>();
        saturday.add(new Schedule("Software Engineering","1:00 PM","2:00 PM"));
        saturday.add(new Schedule("Operating System","2:00 PM","3:00 PM"));
        saturday.add(new Schedule("Computer Networks","3:30 PM","4:30 PM"));
    }
    public ArrayList<Schedule> getMonday(){
        return monday;
    }

    public ArrayList<Schedule> getTuesday() {
        return tuesday;
    }

    public ArrayList<Schedule> getWednesday() {
        return wednesday;
    }

    public ArrayList<Schedule> getThursday() {
        return thursday;
    }

    public ArrayList<Schedule> getFriday() {
        return friday;
    }

    public ArrayList<Schedule> getSaturday() {
        return saturday;
    }
}
