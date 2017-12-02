package com.visionstech.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleListView extends AppCompatActivity {
    private ArrayList<String> customers;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);

        ListView simpleList = findViewById(R.id.lista);
        // adapter without String Object
        customers = new ArrayList<String>();
        customers.add("Bayo");
        customers.add("James");
        customers.add("Idowu");
        customers.add("Laide");
        customers.add("Taiwo");
        customers.add("James");
        customers.add("Badmus");
        customers.add("Segun");
        customers.add("Bayo");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, customers);



        // adapter withoout String Object
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
//        adapter.addAll("Sola","Moyo", "David", "Ogooluwa", "Abiodun",
//                "Yemi", "Kayode");

        simpleList.setAdapter(adapter);


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
            //Add without String Object
//            adapter.add("Bobo");

            //Add with String Object
            customers.add("Nikon");
            adapter.notifyDataSetChanged();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
