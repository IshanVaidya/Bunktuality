package com.example.android.bunktuality.Timetable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.bunktuality.R;

import java.util.ArrayList;

/**
 * Created by Ishan on 09-12-2017.
 */

public class WednesdayFragment extends Fragment {
    public WednesdayFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_monday, container, false);
        TimeTable tt=new TimeTable();
        final ArrayList<Schedule> wednesday = tt.getWednesday();

        ScheduleAdapter itemsAdapter=new ScheduleAdapter(getActivity(),wednesday);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
