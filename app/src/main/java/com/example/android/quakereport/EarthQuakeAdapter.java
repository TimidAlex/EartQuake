package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.example.android.quakereport.R.id.mag;

/**
 * Created by Alexandra Mukhina on 14.06.2017.
 */

public class EarthQuakeAdapter extends ArrayAdapter <EarthQuake> {
    private static final String LOCATION_SEPARATOR = " of ";
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

        TextView mags = (TextView) listItemView.findViewById(mag);
        DecimalFormat formatter = new DecimalFormat("0.00");
        Double doublemag = new Double(currentQuake.getMagnitude());

        String output = formatter.format(doublemag);

        mags.setText(output);



        String originalLocation = currentQuake.getCity();
        String primaryLocation;
        String locationOffset;

            if (originalLocation.contains(LOCATION_SEPARATOR)) {

                String [] parts = originalLocation.split(LOCATION_SEPARATOR);
                locationOffset = parts [0] + LOCATION_SEPARATOR;
                primaryLocation = parts [1];

            }

            else {
                locationOffset = getContext().getString(R.string.near_the);
                primaryLocation = originalLocation;
            }
        TextView primaryloc = (TextView) listItemView.findViewById(R.id.primaryloc);
        primaryloc.setText(primaryLocation);


        TextView locoff = (TextView) listItemView.findViewById(R.id.locoff);
        locoff.setText(locationOffset);


        TextView dateView = (TextView) listItemView.findViewById(R.id.data);

        Date dateObject  = new Date (currentQuake.getMilliSec());
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");

        String formattedDate = dateFormatter.format(dateObject);
        dateView.setText(formattedDate);



        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        Date dateObjectTime  = new Date (currentQuake.getMilliSec());

        String formattedDate2 = timeFormat.format(dateObjectTime);
        timeView.setText(formattedDate2);



        return listItemView;


    }
}
