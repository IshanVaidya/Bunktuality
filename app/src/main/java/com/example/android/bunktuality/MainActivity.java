package com.example.android.bunktuality;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.bunktuality.Statistics.MyStats;
import com.example.android.bunktuality.Statistics.Stats;
import com.example.android.bunktuality.Statistics.StatsAdapter;
import com.example.android.bunktuality.Timetable.Main2Activity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyStats mine= new MyStats();
        final ArrayList<Stats> current=mine.getStats();
        StatsAdapter itemsAdapter=new StatsAdapter(this, current);
        ListView listView = (ListView) findViewById(R.id.statslist);
        listView.setAdapter(itemsAdapter);

        Button button = (Button) findViewById(R.id.table);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView < ? > adapter, View view,int position, long arg){
            // TODO Auto-generated method stub
                TextView v = (TextView) view.findViewById(R.id.sub_list);

                Toast.makeText(getApplicationContext(), "selected Item Name is " + v.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
