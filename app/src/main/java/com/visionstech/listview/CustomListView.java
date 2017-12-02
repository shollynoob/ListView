package com.visionstech.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListView extends AppCompatActivity {
    private ArrayList<People> peopleArrayList;
    private PeopleAdapter peopleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        ListView customeList = findViewById(R.id.listb);

        peopleArrayList = new ArrayList<People>();
        peopleArrayList.add(new People("Sholly","Cage",R.drawable.ic_launcher_background));
        peopleArrayList.add(new People("Paul","Adeolu",R.drawable.ic_launcher_background));
        peopleArrayList.add(new People("Bimbo","Oke",R.drawable.ic_launcher_background));
        peopleArrayList.add(new People("Grace","Okonkwo",R.drawable.ic_launcher_background));
        peopleArrayList.add(new People("Phillip","Chukwudi",R.drawable.ic_launcher_background));
        peopleArrayList.add(new People("Nikon","Dickson",R.drawable.ic_launcher_background));

        peopleAdapter = new PeopleAdapter(this, peopleArrayList);
        customeList.setAdapter(peopleAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.add) {
            peopleArrayList.add(new People("Bolu","Brownson"));
            peopleAdapter.notifyDataSetChanged();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
