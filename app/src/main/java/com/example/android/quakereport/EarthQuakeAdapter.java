package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Alexandra Mukhina on 14.06.2017.
 */

public class EarthQuakeAdapter extends ArrayAdapter <EarthQuake> {
    public EarthQuakeAdapter(@NonNull Context context, ArrayList <EarthQuake> earthQuakes) {
        super(context, 0, earthQuakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.main_layout,parent,false);
        }

        EarthQuake currentQuake  = getItem(position);

        TextView mag = (TextView) listItemView.findViewById(R.id.mag);
        mag.setText(currentQuake.getMagnitude());

        TextView city = (TextView) listItemView.findViewById(R.id.city);
        city.setText(currentQuake.getCity());

        TextView data = (TextView) listItemView.findViewById(R.id.data);
        data.setText(currentQuake.getData());

        return listItemView;


    }
}
