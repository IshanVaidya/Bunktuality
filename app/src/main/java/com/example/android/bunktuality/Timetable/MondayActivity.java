package com.example.android.bunktuality.Timetable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.bunktuality.R;

public class MondayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new MondayFragment())
                .commit();
    }
}
