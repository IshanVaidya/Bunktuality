package com.example.android.bunktuality.Timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Calendar;

/**
 * Created by Ishan on 09-12-2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    Calendar calendar = Calendar.getInstance();
    int today =calendar.get(Calendar.DAY_OF_WEEK)-1;
    private String tabTitles[] = new String[] { "Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday" };
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int day=today-1;
        if (position == 0) {
            if(day==-1)
                day++;
            if(day==0)
                return new MondayFragment();
            else if(day==1)
                return new TuesdayFragment();
            else if(day==2)
                return new WednesdayFragment();
            else if(day==3)
                return new ThursdayFragment();
            else if(day==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
        else if (position == 1){
            if(day==-1)
                day++;
            if((day+1)%6==0)
                return new MondayFragment();
            else if((day+1)%6==1)
                return new TuesdayFragment();
            else if((day+1)%6==2)
                return new WednesdayFragment();
            else if((day+1)%6==3)
                return new ThursdayFragment();
            else if((day+1)%6==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
        else if (position==2) {
            if(day==-1)
                day++;
            if((day+2)%6==0)
                return new MondayFragment();
            else if((day+2)%6==1)
                return new TuesdayFragment();
            else if((day+2)%6==2)
                return new WednesdayFragment();
            else if((day+2)%6==3)
                return new ThursdayFragment();
            else if((day+2)%6==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
        else if (position==3){
            if(day==-1)
                day++;
            if((day+3)%6==0)
                return new MondayFragment();
            else if((day+3)%6==1)
                return new TuesdayFragment();
            else if((day+3)%6==2)
                return new WednesdayFragment();
            else if((day+3)%6==3)
                return new ThursdayFragment();
            else if((day+3)%6==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
        else if (position==4){
            if(day==-1)
                day++;
            if((day+4)%6==0)
                return new MondayFragment();
            else if((day+4)%6==1)
                return new TuesdayFragment();
            else if((day+4)%6==2)
                return new WednesdayFragment();
            else if((day+4)%6==3)
                return new ThursdayFragment();
            else if((day+4)%6==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
        else{
            if(day==-1)
                day++;
            if((day+5)%6==0)
                return new MondayFragment();
            else if((day+5)%6==1)
                return new TuesdayFragment();
            else if((day+5)%6==2)
                return new WednesdayFragment();
            else if((day+5)%6==3)
                return new ThursdayFragment();
            else if((day+5)%6==4)
                return new FridayFragment();
            else
                return new SaturdayFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        int x=today-1;
        if(position==0&&x!=-1){
            return "Today";
        }
        else if(position==0&&x==-1){
            return "Monday";
        }
        else
            if(x==-1)
                x=0;
            return tabTitles[(x+position)%6];
    }
}
