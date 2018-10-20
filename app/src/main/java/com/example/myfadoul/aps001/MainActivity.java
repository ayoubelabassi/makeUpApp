package com.example.myfadoul.aps001;

import android.content.Intent;
import android.content.res.TypedArray;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myfadoul.aps001.Reader;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listview);






        String[] item = getResources().getStringArray(R.array.index);

        ItemAdapter itemAdapter=new ItemAdapter(item,this);
        //ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.rows, R.id.textView3, item);
        listView.setAdapter(itemAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, Reader.class);
                intent.putExtra("page", position);
                startActivity(intent);
            }
        });

    }

}
