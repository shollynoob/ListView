package com.visionstech.listview;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PeopleAdapter extends ArrayAdapter<People>{

    public PeopleAdapter(Activity context, ArrayList<People> people) {
        super(context, 0, people);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_custome_view, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        People currentPeople = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView fname = (TextView) listItemView.findViewById(R.id.fname);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        fname.setText(currentPeople.getmFirstname());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.lname);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentPeople.getmLastname());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentPeople.hasImage()) {
            iconView.setImageResource(currentPeople.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }else{
            iconView.setVisibility(View.INVISIBLE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
