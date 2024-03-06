package com.example.comeng2024hafta0302;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
               getResources().getStringArray(R.array.countries) ));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText( this
                ,(String) l.getItemAtPosition(position),
                Toast.LENGTH_LONG).show();

    }

    public void webStart(View v){
        Intent myInt = new Intent(MainActivity.this,
                MainActivity2.class);

        startActivity(myInt);


    }
}