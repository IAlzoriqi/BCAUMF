package com.ialzoriqi.bias;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class NadahAdapter extends ArrayAdapter<Nasah> {
    public NadahAdapter(Context context, ArrayList<Nasah> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Nasah user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.nasaih_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvHome = (TextView) convertView.findViewById(R.id.Ditels);
        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        tvHome.setText(user.detils);
        // Return the completed view to render on screen
        return convertView;
    }
}