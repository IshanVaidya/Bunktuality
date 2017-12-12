package com.example.android.bunktuality.Timetable;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.bunktuality.R;

import java.util.ArrayList;

/**
 * Created by Ishan on 08-12-2017.
 */

public class ScheduleAdapter extends ArrayAdapter {
    public ScheduleAdapter(Context context, ArrayList<Schedule> wordList) {
        super(context, 0, wordList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Schedule currentWord = (Schedule) getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        LinearLayout lView = (LinearLayout) listItemView.findViewById(R.id.linrView);
        TextView subTextView = (TextView) listItemView.findViewById(R.id.sub_textView);

        subTextView.setText(currentWord.getSub());


        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.start_textView);

        nameTextView2.setText(currentWord.getStart());

        TextView nameTextView3 = (TextView) listItemView.findViewById(R.id.end_textView);

        nameTextView3.setText(currentWord.getEnd());

        return listItemView;
    }
}
