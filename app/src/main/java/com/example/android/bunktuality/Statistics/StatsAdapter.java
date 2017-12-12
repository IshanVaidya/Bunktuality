package com.example.android.bunktuality.Statistics;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.bunktuality.R;

import java.util.ArrayList;

/**
 * Created by Ishan on 11-12-2017.
 */

public class StatsAdapter extends ArrayAdapter {
    public StatsAdapter(Context context, ArrayList<Stats> wordList) {
        super(context, 0, wordList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Stats currentWord = (Stats) getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_stats, parent, false);
        }
        TextView subTextView = (TextView) listItemView.findViewById(R.id.sub_list);

        subTextView.setText(currentWord.getSubName());


        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.credits_list);

        nameTextView2.setText(currentWord.getCredits()+" ");

        TextView nameTextView3 = (TextView) listItemView.findViewById(R.id.missed_list);

        nameTextView3.setText(currentWord.getMissed()+" ");
        TextView nameTextView4 = (TextView) listItemView.findViewById(R.id.total_list);
        int total=currentWord.getMissed()+currentWord.getAttended();
        nameTextView4.setText(total+" ");
        TextView nameTextView5 = (TextView) listItemView.findViewById(R.id.outOf_list);

        nameTextView5.setText(currentWord.getTotal()+" ");
        return listItemView;
    }
}
